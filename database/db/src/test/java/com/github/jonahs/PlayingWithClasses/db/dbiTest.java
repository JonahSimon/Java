/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.jonahs.PlayingWithClasses.db;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author god
 */
public class dbiTest {
    
    public dbiTest() {
    }

    /**
     * Test of getConnection method, of class dbi.
     */
    //@Test
    public void testGetConnection() throws Exception {
        System.out.println("getConnection");
        dbi instance = new dbiImpl();
        Connection expResult = null;
        Connection result = instance.getConnection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSqlStatementTimeoutSeconds method, of class dbi.
     */
    //@Test
    public void testGetSqlStatementTimeoutSeconds() {
        System.out.println("getSqlStatementTimeoutSeconds");
        dbi instance = new dbiImpl();
        int expResult = 0;
        int result = instance.getSqlStatementTimeoutSeconds();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPreparedStatement method, of class dbi.
     */
    @Test
    public void testGetPreparedStatement() throws Exception {
        System.out.println("getPreparedStatement");
        String sql = "INSERT INTO warehouses(name,capacity) VALUES(?,?)";
        dbi instance = new dbiImpl();
        instance.getConnection();
        String expResult = "org.sqlite.jdbc4.JDBC4PreparedStatement@30b8a058";
        PreparedStatement result = instance.getPreparedStatement(sql);
        assertEquals(expResult, result.toString());
    }

    /**
     * Test of getStatement method, of class dbi.
     */
    //@Test
    public void testGetStatement() throws Exception {
        System.out.println("getStatement");
        dbi instance = new dbiImpl();
        Statement expResult = null;
        Statement result = instance.getStatement();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sql method, of class dbi.
     */
    //@Test
    public void testSql_String_ObjectArr() throws Exception {
        System.out.println("sql");
        String sql = "";
        Object[] objects = null;
        dbi instance = new dbiImpl();
        ResultSet expResult = null;
        ResultSet result = instance.sql(sql, objects);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sql method, of class dbi.
     */
    //@Test
    public void testSql_String() throws Exception {
        System.out.println("sql");
        String command = "";
        dbi instance = new dbiImpl();
        instance.sql(command);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of booleanResult method, of class dbi.
     */
    //@Test
    public void testBooleanResult() throws Exception {
        System.out.println("booleanResult");
        ResultSet resultSet = null;
        dbi instance = new dbiImpl();
        boolean expResult = false;
        boolean result = instance.booleanResult(resultSet);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of longResult method, of class dbi.
     */
    //@Test
    public void testLongResult() throws Exception {
        System.out.println("longResult");
        ResultSet resultSet = null;
        dbi instance = new dbiImpl();
        long expResult = 0L;
        long result = instance.longResult(resultSet);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doubleResult method, of class dbi.
     */
    //@Test
    public void testDoubleResult() throws Exception {
        System.out.println("doubleResult");
        ResultSet resultSet = null;
        dbi instance = new dbiImpl();
        double expResult = 0.0;
        double result = instance.doubleResult(resultSet);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stringResult method, of class dbi.
     */
    //@Test
    public void testStringResult() throws Exception {
        System.out.println("stringResult");
        ResultSet resultSet = null;
        dbi instance = new dbiImpl();
        String expResult = "";
        String result = instance.stringResult(resultSet);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of blobResult method, of class dbi.
     */
    //@Test
    public void testBlobResult() throws Exception {
        System.out.println("blobResult");
        ResultSet resultSet = null;
        dbi instance = new dbiImpl();
        Blob expResult = null;
        Blob result = instance.blobResult(resultSet);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of results method, of class dbi.
     */
    //@Test
    public void testResults() throws Exception {
        System.out.println("results");
        ResultSet resultSet = null;
        Object[] args = null;
        dbi instance = new dbiImpl();
        Object[] expResult = null;
        Object[] result = instance.results(resultSet, args);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    public class dbiImpl implements dbi {

        public Connection getConnection() throws SQLException {
            return null;
        }

        public void close() throws SQLException {
        }
    }
    
}
