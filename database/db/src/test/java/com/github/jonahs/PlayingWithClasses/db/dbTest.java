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
public class dbTest {
    
    public dbTest() {
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
     * Test of reset method, of class db.
     */
    @Test
    public void testReset() throws Exception {
        System.out.println("reset");
        db instance = new db();
        instance.run();
        instance.reset();
        instance.insertBand("Head Portals");
        String Result = "Head Portals";
        String expResult = instance.getBand(1);
        assertEquals(expResult,Result);
        instance.close();
    }

    /**
     * Test of insertBand method, of class db.
     */
    @Test
    public void testInsertBand() throws Exception {
        System.out.println("insertBand");
        String name = "Alice in Chains";
        db instance = new db();
        instance.reset();
        instance.insertBand(name);
        String expResult = name;
        String result = instance.getBand(1);
        assertEquals(expResult, result);
        instance.close();
    }

    /**
     * Test of getBand method, of class db.
     */
    @Test
    public void testGetBand() throws Exception {
        System.out.println("getBand");
        long id = 1 ;
        db instance = new db();
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
        instance.run();
        String ExpResult = instance.getBand(1);
        String ExpResult2 = instance.getBand(2);
        assertEquals(ExpResult, "Alice in Chains");
        assertEquals(ExpResult2,"ACDC");
        instance.close();
    }
    
}
