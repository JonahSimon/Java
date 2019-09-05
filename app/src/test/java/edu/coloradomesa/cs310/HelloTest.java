/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.coloradomesa.cs310;

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
public class HelloTest {
    
    public HelloTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getWho method, of class Hello.
     */
    @Test
    public void testGetWho() {
        System.out.println("getWho");
        Hello instance = new Hello();
        String expResult = "World";
        String result = instance.getWho();
        assertEquals(expResult, result);
    }

    /**
     * Test of setWho method, of class Hello.
     */
    @Test
    public void testSetWho() {
        System.out.println("setWho");
        String who = "World";
        Hello instance = new Hello();
        instance.setWho(who);
    }

    /**
     * Test of getGreeting method, of class Hello.
     */
    @Test
    public void testGetGreeting() {
        System.out.println("getGreeting");
        Hello instance = new Hello();
        String expResult = "Hello";
        String result = instance.getGreeting();
        assertEquals(expResult, result);
    }

    /**
     * Test of setGreeting method, of class Hello.
     */
    @Test
    public void testSetGreeting() {
        System.out.println("setGreeting");
        String greeting = "Hello";
        Hello instance = new Hello();
        instance.setGreeting(greeting);
    }

    /**
     * Test of getMessage method, of class Hello.
     */
    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        Hello instance = new Hello();
        String expResult = "Hello World!";
        String result = instance.getMessage();
        assertEquals(expResult, result);
    }

    /**
     * Test of main method, of class Hello.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        Hello.main(args);
    }
    
}
