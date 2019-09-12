/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.deathknighthero;

import java.util.Scanner;
import org.junit.*;
import static org.junit.Assert.*;


/**
 *
 * @author god
 */
public class DKHTest {
    
    public DKHTest() {
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
     * Test of main method, of class DKH.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        DKH.main(args);
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class DKH.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        DKH instance = new DKH();
        instance.read();
        fail("test Prototype");
    }

    /**
     * Test of finished method, of class DKH.
     */
    @Test
    public void testFinished() {
        System.out.println("finished");
        DKH instance = new DKH();
        boolean expResult = false;
        boolean result = instance.finished();
        assertEquals(expResult, result);
    }

    /**
     * Test of solve method, of class DKH.
     */
    @Test
    public void testSolve() {
        System.out.println("solve");
        DKH instance = new DKH();
        instance.solve();
        fail("The test case is a prototype.");
    }

    /**
     * Test of write method, of class DKH.
     */
    @Test
    public void testWrite() {
        System.out.println("write");
        DKH instance = new DKH();
        instance.write();
        fail("prototype");
    }
    
    @Test
    public void testsample1(){
        DKH dkh = new DKH();
        String EOL = System.lineSeparator();
        Scanner in;
        in = new Scanner("3" + EOL + "DCOOO" + EOL +"DODOCD"+ EOL + "COD" + EOL);
        dkh.run();
        fail("prototype");
    }

    /**
     * Test of run method, of class DKH.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        DKH instance = new DKH();
        instance.run();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
