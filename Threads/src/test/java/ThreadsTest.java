/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
import java.util.Vector;
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
public class ThreadsTest {
    
    public ThreadsTest() {
    }

    /**
     * Test of getNumbers method, of class Threads.
     */
    @Test
    public void testGetNumbers() {
        System.out.println("getNumbers");
        Threads instance = new Threads();
        String EOL = System.lineSeparator();
        instance.input = new Scanner("1" + EOL +
                                     "2" + EOL +
                                     "3" + EOL +
                                     " " + EOL);
        Vector<Integer> expResult = new Vector();
        expResult.add(1);
        expResult.add(2);
        expResult.add(3);
        Vector<Integer> result = instance.getNumbers();
        assertEquals(expResult, result);
    }

    /**
     * Test of findAverage method, of class Threads.
     */
    @Test
    public void testFindAverage() {
        System.out.println("findAverage");
        Vector<Integer> numbers = new Vector();
        numbers.add(5);
        numbers.add(4);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);
        
        Threads instance = new Threads();
        float expResult = (float) 3.0;
        float result = instance.findAverage(numbers);
        assertEquals(expResult, result);
    }

    /**
     * Test of parallelEval method, of class Threads.
     */
    
    // TODO Fix this test
    @Test
    public void testParallelEval() {
        System.out.println("parallelEval");
        int threads = 0;
        Threads instance = new Threads();
        instance.parallelEval(threads);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
