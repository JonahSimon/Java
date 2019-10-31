/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.jonahs.PlayingWithClasses.db;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author god
 */
public class appTest {
    
    public appTest() {
    }
   
    /**
     * Test of run method, of class app.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos); 
        System.setOut(ps);  
        String ExpResult = "The driver name is SQLite JDBC" + System.lineSeparator() +
                           "A new database has been created." + System.lineSeparator() +
                           "1\tRaw Materials\t3000.0"  + System.lineSeparator() +
                           "2\tSemifinished Goods\t4000.0" + System.lineSeparator() +
                           "3\tFinished Goods\t5000.0" + System.lineSeparator();
        app instance = new app();
        instance.run();
        System.out.flush();
        instance.selectAll();
        assertEquals(ExpResult,baos.toString());   
    }
    
}
