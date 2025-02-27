/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.jonahs.PlayingWithClasses.db;

/**
 *
 * @author god
 */
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author god
 */
public interface dbi extends AutoCloseable {

    /**
     *
     * @return
     * @throws SQLException
     */
    Connection getConnection() throws SQLException;

    default int getSqlStatementTimeoutSeconds() {
        return 30;
    }

    /**
     *
     * @param sql
     * @return
     * @throws SQLException
     */
    default PreparedStatement getPreparedStatement(String sql) throws SQLException {
        Connection connection = getConnection();
        int keyMode = sql.startsWith("insert")
                ? Statement.RETURN_GENERATED_KEYS : Statement.NO_GENERATED_KEYS;

        PreparedStatement preparedStatement
                = connection.prepareStatement(sql, keyMode);
        preparedStatement.setQueryTimeout(getSqlStatementTimeoutSeconds());
        return preparedStatement;

    }

    default Statement getStatement() throws SQLException {
        Connection connection = getConnection();
        Statement statement = connection.createStatement();
        statement.setQueryTimeout(getSqlStatementTimeoutSeconds());
        return statement;

    }
    
    // db.sql("insert into mytable (height,weight) values (?,?)", 3,7);

    default ResultSet sql(String sql, Object... objects) throws SQLException {
        // sql="insert...";
        // objects = new Object[] { new Integer(3), new Integer(7) }
        PreparedStatement preparedStatement = getPreparedStatement(sql);
        int index = 1;
        for (Object object : objects) {
            if (object instanceof Boolean) {
                preparedStatement.setBoolean(index, (Boolean) object);
            } else if (object instanceof Integer) {
                preparedStatement.setInt(index, (Integer) object);
            } else if (object instanceof Long) {
                preparedStatement.setLong(index, (Long) object);
            } else if (object instanceof Double) {
                preparedStatement.setDouble(index, (Double) object);
            } else if (object instanceof String) {
                preparedStatement.setString(index, (String) object);
            } else if (object instanceof Blob) {
                preparedStatement.setBlob(index, (Blob) object);
            } else {
                throw new IllegalStateException("can't set type " + object.getClass().getName());
            }
            ++index;
        }
        if (sql.startsWith("insert")) {
            preparedStatement.execute();
            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            return resultSet;
        } else {
            ResultSet resultSet = preparedStatement.executeQuery();
            return resultSet;
        }
    }

    /**
     *
     * @param command
     * @throws SQLException
     */
    default void sql(String command) throws SQLException {
        Statement statement = getStatement();
        statement.executeUpdate(command);
    }

    /**
     *
     * @param resultSet
     * @return
     * @throws SQLException
     */
    default boolean booleanResult(ResultSet resultSet) throws SQLException {
        if (resultSet != null && resultSet.next()) {
            return resultSet.getBoolean(1);
        }
        throw new SQLException("missing boolean result");
    }

    default long longResult(ResultSet resultSet) throws SQLException {
        if (resultSet != null && resultSet.next()) {
            return resultSet.getLong(1);
        }
        throw new SQLException("missing long result");
    }

    /**
     *
     * @param resultSet
     * @return
     * @throws SQLException
     */
    default double doubleResult(ResultSet resultSet) throws SQLException {
        if (resultSet != null && resultSet.next()) {
            return resultSet.getDouble(1);
        }
        throw new SQLException("missing double result");
    }

    /**
     *
     * @param resultSet
     * @return
     * @throws SQLException
     */
    default String stringResult(ResultSet resultSet) throws SQLException {
        if (resultSet != null && resultSet.next()) {
            return resultSet.getString(1);
        }
        throw new SQLException("missing string result");
    }

    /**
     *
     * @param resultSet
     * @return
     * @throws SQLException
     */
    default Blob blobResult(ResultSet resultSet) throws SQLException {
        if (resultSet != null && resultSet.next()) {
            return resultSet.getBlob(1);
        }
        throw new SQLException("missing blob result");
    }

    /**
     *
     * @param resultSet
     * @param args
     * @return
     * @throws SQLException
     */
    default Object[] results(ResultSet resultSet, Object... args) throws SQLException {
        if (resultSet != null && resultSet.next()) {
            Object index = Integer.valueOf(0);
            ArrayList<Object> ans = new ArrayList<Object>();
            int i = 0;
            while (i < args.length) {
                if (args[i] instanceof Integer) {
                    index = args[i];
                    ans.add(resultSet.getObject((Integer) index, (Class) args[i + 1]));
                    ++i;
                } else if (args[i] instanceof String) {
                    index = args[i];
                    ans.add(resultSet.getObject((String) index, (Class) args[i + 1]));
                    ++i;
                } else {
                    index = 1 + (Integer) index;
                    ans.add(resultSet.getObject((Integer) index, (Class) args[i]));
                }
                ++i;
            }
            return ans.toArray();
        } else {
            throw new SQLException("missing result");
        }
    }
    
    /**
     *
     * @throws SQLException
     */
    void close() throws SQLException;
}
