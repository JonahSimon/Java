/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.jonahs.PlayingWithClasses.db;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author god
 */
public class appTest {
    
    public appTest() {
    }

    @Test
    public void testInsert() {
        System.out.println("insert");
        String name = "bob";
        double capacity = 1;
        app instance = new app();
        instance.insert(name, capacity);
        //instance.equals(name);
    }

    /**
     * Test of createNewTable method, of class app.
     */
    @Test
    public void testCreateNewTable() {
        System.out.println("createNewTable");
        app instance = new app();
        instance.createNewTable();
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
