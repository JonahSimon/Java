/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.coloradomesa.cs310;

import org.junit.*;
import static org.junit.Assert.*;



/**
 *
 * @author god
 */
public class HelloTest {
    
    public HelloTest() {
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
    
    @Test
    public void testInChinese() {
        Hello hello = new Hello();
        hello.setlanguage("cn");
        String message = hello.getMessage();
        String expect = "你好，世界！";
        assertEquals(expect,message);
    }
    
}
