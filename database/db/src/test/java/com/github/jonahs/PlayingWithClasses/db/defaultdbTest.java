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
import org.junit.*;
import static org.junit.Assert.*;
import static org.junit.Assert.assertNotEquals;


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
     * Test of getURL method and setURL method, of class defaultdb.
     */
    @Test
    public void testURL() {
        System.out.println("URL");
        defaultdb instance = new defaultdb();
        String expResult = "BleepBloop.org";
        instance.setURL("BleepBloop.org");
        String result = instance.getURL();
        assertEquals(expResult, result);
        instance.setURL("YadaYada.com");
        result = instance.getURL();
        assertNotEquals(expResult,result);
    }

    /**
     * Test of getSqlStatementTimeoutSeconds method and 
     * setSqlStatementTimeoutSeconds method, of class defaultdb.
     */
    @Test
    public void testSqlStatementTimeoutSeconds() {
        System.out.println("getSqlStatementTimeoutSeconds");
        defaultdb instance = new defaultdb();
        int expResult = 0;
        instance.setSqlStatementTimeoutSeconds(0);
        int result = instance.getSqlStatementTimeoutSeconds();
        assertEquals(expResult, result);
        instance.setSqlStatementTimeoutSeconds(10);
        result = instance.getSqlStatementTimeoutSeconds();
        assertNotEquals(expResult,result);
    }

    /**
     * Test of getConnection method, of class defaultdb.
     */
    @Test
    public void testGetConnection() throws Exception {
        System.out.println("getConnection");
        defaultdb instance = new defaultdb();
        instance.setURL("jdbc:sqlite:Bands.db");
        Connection expResult = null;
        Connection result = instance.getConnection();
        assertNotEquals(expResult, result);
    }

    /**
     * Test of close method, of class defaultdb.
     */
    @Test
    public void testClose() throws Exception {
        System.out.println("close");
        defaultdb instance = new defaultdb();
        instance.setURL("jdbc:sqlite:Bands.db");
        Connection result = instance.getConnection();
        instance.close();
        Connection result2 = instance.getConnection();
        assertNotEquals(result2,result);   
    }
    
}
