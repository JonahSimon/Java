/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.deathknighthero;

import java.io.PrintStream;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author god
 */
public class DKH {
    Scanner in = new Scanner(System.in);
    PrintStream out = System.out;
    
            
    int n, k, wins;
    String line;
    
    public static void main(String[] args) throws Exception {
        DKH dkh = new DKH();
        dkh.run();
    }

    void run() {    
        read();
        write();
    }

    void read() {
        wins = 0;
        n = Integer.parseInt(in.nextLine());
        for(int i = 0; i < n; i++) {
            line = in.nextLine();
            solve(line);
        }
    }

    void solve(String line) {
        if(line.contains("CD")){}
            
        else wins++;
        
    }
                
    void write() {
        out.println(wins);
    }  
}
/*
3
DCOOO
DODOCD
COD
*/