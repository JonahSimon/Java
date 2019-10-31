/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.jonahs.PlayingWithClasses.db;

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
public class appTest {
    
    public appTest() {
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
     * Test of insert method, of class app.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        String name = "";
        double capacity = 0.0;
        app instance = new app();
        instance.insert(name, capacity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createNewTable method, of class app.
     */
    @Test
    public void testCreateNewTable() {
        System.out.println("createNewTable");
        app instance = new app();
        instance.createNewTable();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createNewDatabase method, of class app.
     */
    @Test
    public void testCreateNewDatabase() {
        System.out.println("createNewDatabase");
        app instance = new app();
        instance.createNewDatabase();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class app.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        app.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of run method, of class app.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        app instance = new app();
        instance.run();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
