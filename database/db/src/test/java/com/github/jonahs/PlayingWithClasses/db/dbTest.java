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
public class dbTest {
    
    public dbTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    /**
     * Test of reset method, of class db.
     */
    @Test
    public void testReset() throws Exception {
        System.out.println("reset");
        db instance = new db();
        instance.reset();
        instance.insertBand("Head Portals");
        String Result = "Head Portals";
        String expResult = instance.getBand(1);
        assertEquals(expResult,Result);
        instance.close();
    }

    /**
     * Test of insertBand method, of class db.
     * @throws java.lang.Exception
     */
    @Test
    public void testInsertBand() throws Exception {
        System.out.println("insertBand");
        String name = "Alice in Chains";
        try (db instance = new db()) {
            instance.getConnection();
            instance.reset();
            instance.insertBand(name);
            String expResult = name;
            String result = instance.getBand(1);
            assertEquals(expResult, result);
            instance.close();
        }
    }

    /**
     * Test of getBand method, of class db.
     */
    @Test
    public void testGetBand() throws Exception {
        System.out.println("getBand");
        long id = 1 ;
        db instance = new db();
        instance.getConnection();
        instance.reset();
        instance.insertBand("Modest Mouse");
        String expResult = "Modest Mouse";
        String result = instance.getBand(id);
        assertEquals(expResult, result);
        instance.close();
    }

    /**
     * Test of run method, of class db.
     */
    @Test
    public void testRun() throws Exception {
        System.out.println("run");
        db instance = new db();
        instance.getConnection();
        instance.run();
        String ExpResult = instance.getBand(1);
        String ExpResult2 = instance.getBand(2);
        assertEquals(ExpResult, "Alice in Chains");
        assertEquals(ExpResult2,"ACDC");
        instance.close();
    }
    
}
