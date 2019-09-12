/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.deathknighthero;

import java.io.PrintStream;
import java.util.Scanner;
import java.util.regex.*;

/**
 *
 * @author god
 */
public class DKH {
    Scanner in;
    PrintStream out;
    int n, k, wins;
    
    public static void main(String[] args) throws Exception {
        DKH dkh = new DKH();
        dkh.run();
        
    }

    void run() {
        in = new Scanner(System.in);
        out = System.out;
        
        
        while(true){
            read();
            if (finished()) break;
            solve();
            write();
        }
    }

    void read() {
        wins = 0;
        String battles = in.nextLine();
        n = Integer.parseInt(battles);
    }

    boolean finished() {
       return true;
    }

    void solve() {
        for(int i = 0; i<n; i++){
            String sequence = in.nextLine();
            if(sequence.matches("\\w*DC\\w")){
                wins = wins + 1;
            }
        }
        finished();
    }
                
    void write() {
        out.print(wins);
    }  
}
