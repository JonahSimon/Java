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
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author god
 */
public class dbiTest {
    
    public dbiTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test of getConnection method, of class dbi.
     */
    @Test
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
    @Test
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
        String sql = "";
        dbi instance = new dbiImpl();
        PreparedStatement expResult = null;
        PreparedStatement result = instance.getPreparedStatement(sql);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatement method, of class dbi.
     */
    @Test
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
    @Test
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
    @Test
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
    @Test
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
    @Test
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
    @Test
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
    @Test
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
    @Test
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
    @Test
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

    /**
     * Test of close method, of class dbi.
     */
    @Test
    public void testClose() throws Exception {
        System.out.println("close");
        dbi instance = new dbiImpl();
        instance.close();
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
