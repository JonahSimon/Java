/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class ThreadJobTest {
    
    public ThreadJobTest() {
    }

    /**
     * Test of run method, of class ThreadJob.
     */
    
    // Todo Fix this test
    @Test
    public void testRun() {
        System.out.println("run");
        ThreadJob instance = new ThreadJob();
        instance.problem = new Threads();
        instance.numbers.add(5);
        instance.numbers.add(10);
        instance.numbers.add(20);
        instance.numbers.add(100);
        instance.run();
        float expectResult = (float) 33.75;
        assertEquals(expectResult,instance.average);
    }
    
}
