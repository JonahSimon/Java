/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.jonahs.playingwithclasses.babelfish;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author god
 */
public class BabelfishTest {
    
    public BabelfishTest() {
    }

    @Test
    public void testTestCases() {
        System.out.println("testCases");
        String testWord = "";
        Babelfish instance = new Babelfish();
        String expResult = "";
        String result = instance.testCases(testWord);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testReadInput() {
        System.out.println("readInput");
        Babelfish instance = new Babelfish();
        instance.readInput();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testReadCases() {
        System.out.println("readCases");
        Babelfish instance = new Babelfish();
        instance.readCases();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    } 
}
