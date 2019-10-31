/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.jonahs.PlayingWithClasses.db;

import java.sql.Connection;
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
public class defaultdbTest {
    
    public defaultdbTest() {
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
     * Test of getURL method, of class defaultdb.
     */
    @Test
    public void testGetURL() {
        System.out.println("getURL");
        defaultdb instance = new defaultdb();
        String expResult = "";
        String result = instance.getURL();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSqlStatementTimeoutSeconds method, of class defaultdb.
     */
    @Test
    public void testGetSqlStatementTimeoutSeconds() {
        System.out.println("getSqlStatementTimeoutSeconds");
        defaultdb instance = new defaultdb();
        int expResult = 0;
        int result = instance.getSqlStatementTimeoutSeconds();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSqlStatementTimeoutSeconds method, of class defaultdb.
     */
    @Test
    public void testSetSqlStatementTimeoutSeconds() {
        System.out.println("setSqlStatementTimeoutSeconds");
        int value = 0;
        defaultdb instance = new defaultdb();
        instance.setSqlStatementTimeoutSeconds(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setURL method, of class defaultdb.
     */
    @Test
    public void testSetURL() {
        System.out.println("setURL");
        String url = "";
        defaultdb instance = new defaultdb();
        instance.setURL(url);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConnection method, of class defaultdb.
     */
    @Test
    public void testGetConnection() throws Exception {
        System.out.println("getConnection");
        defaultdb instance = new defaultdb();
        Connection expResult = null;
        Connection result = instance.getConnection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of close method, of class defaultdb.
     */
    @Test
    public void testClose() throws Exception {
        System.out.println("close");
        defaultdb instance = new defaultdb();
        instance.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
