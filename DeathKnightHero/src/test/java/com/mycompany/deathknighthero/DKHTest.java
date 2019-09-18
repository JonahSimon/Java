/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.deathknighthero;

import java.util.Scanner;
import org.junit.*;
import static org.junit.Assert.*;

import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
/**
 *
 * @author god
 */
public class DKHTest {

    DKH ex1(){
       DKH dkh = new DKH();
       dkh.n = 1;
       dkh.line = "OOODCOOCD";
       dkh.wins=1;
       return dkh;
    }

    public void testRun() {
        DKH instance = new DKH();
        String EOL = System.lineSeparator();
        instance.in = new Scanner("3" + EOL
                                    + "DCOOO" + EOL
                                    + "DODOCD" + EOL
                                    + "COD" + EOL);
        var bos = new ByteArrayOutputStream();
        instance.out = new PrintStream(bos);
        instance.run();
        instance.out.close();
        String expect = "2" + EOL;
        String result = bos.toString();
        assertEquals(expect,result);
    }
    
    void assertAppInEquals(DKH expect, DKH result) {
        assertEquals(expect.wins, result.wins);
        assertEquals(expect.line, result.line);
        assertEquals(expect.n, result.n);
    }

    public void testRead() {
        DKH expect = ex1();
        DKH result = new DKH();
        result.in = new Scanner("1" + System.lineSeparator());
        result.read();
        assertAppInEquals(expect, result);
    }

    public void testWrite() {
        int expect = 4;
        DKH instance = new DKH();
        var bos = new ByteArrayOutputStream();
        instance.out = new PrintStream(bos);
        instance.wins = 4;
        instance.write();
        instance.out.close();
        String result = bos.toString();
        assertEquals(expect,result);
    }
    
    public void testSolve(){
        DKH instance = new DKH();
        int expect = 0;
        instance.wins = 0;
        instance.line = "OOOCDOO";
        instance.solve(instance.line);
        int result = instance.wins;
        assertEquals(expect,result);
        instance.line = "OOOCDDDODCOO";
        instance.solve(instance.line);
        expect = 1;
        result = instance.wins;
        assertEquals(expect,result);
    }
}
