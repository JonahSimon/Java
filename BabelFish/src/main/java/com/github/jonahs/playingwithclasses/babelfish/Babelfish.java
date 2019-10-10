/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.jonahs.playingwithclasses.babelfish;

import java.util.Scanner;
import java.util.HashMap;

/**
 *
 * @author god
 */
public class Babelfish {
    String firstword, secondword = "";
    HashMap<String,String> translator = new HashMap<String,String>();
    Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        new Babelfish();
    }
    
    public Babelfish() {
    
        readInput();
        readCases();
    }

    public String testCases(String testWord) {
        String word = "eh";
        if(translator.containsKey(testWord)){
            word = translator.get(testWord);
            return word;
        }
        else 
            return word;
    }

    public void readInput() {
        String line = input.nextLine();
        while(!line.isEmpty()){
            String[] words = line.split(" ");
            firstword = words[0];
            secondword = words[1];
            translator.put(secondword,firstword);
            line = input.nextLine();
        }
        
    }

    public void readCases() {
        while (input.hasNext())
            System.out.println(testCases(input.nextLine()));
    }
}

/*
String translation(String foreignWord) {
        String translatedWord = "eh";
        if (dictionary.containsKey(foreignWord))
            translatedWord = dictionary.get(foreignWord);
        return translatedWord;
    }

    void readDictionary() {
        String line = scanner.nextLine();
        while (!line.isEmpty()) {
            String[] words = line.split(" ");
            firstLanguage = words[0]; secondLanguage = words[1];
            dictionary.put(secondLanguage, firstLanguage);
            line = scanner.nextLine();
        }
    }
*/
