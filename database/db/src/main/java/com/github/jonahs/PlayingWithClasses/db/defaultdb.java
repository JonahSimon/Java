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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author god
 */
public class defaultdb extends Object implements dbi{

    private String url;

    /**
     *
     * @return
     */
    public String getURL() {
        return url;
    }

    private int sqlStatementTimeoutSeconds = Integer.MAX_VALUE;

    /**
     *
     * @return
     */
    public int getSqlStatementTimeoutSeconds() {
        return sqlStatementTimeoutSeconds;
    }

    /**
     *
     * @param value
     */
    public void setSqlStatementTimeoutSeconds(int value) {
        this.sqlStatementTimeoutSeconds = value;
    }

    /**
     *
     * @param url
     */
    public void setURL(String url) {
        if (!url.equals(this.url)) {
            synchronized (this) {
                if (connection != null) {
                    throw new UnsupportedOperationException("cannot set url after connecting");
                }
                this.url = url;
            }
        }
    }

    private Connection connection = null;

    /**
     *
     * @return
     * @throws SQLException
     */
    @Override
    public Connection getConnection() throws SQLException {
        if (connection == null) {
            synchronized (this) {
                if (connection == null) {
                    connection = DriverManager.getConnection(url);
                }
            }
        }
        return connection;
    }
    
    /**
     *
     * @throws SQLException
     */
    @Override
    public void close() throws SQLException {
        synchronized(this) {
            if (connection != null) {
                connection.close();
                connection = null;
            }
        }
    }
}
