/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.coloradomesa.cs310;

/**
 *
 * @author god
 */
public class Hello {
    private String greeting = "Hello";
    
    private String who = "World";
    
    private String message = null;
    
    public String getWho() {
        return who;
    }
    
    public void setWho(String who) {
        this.who = who;
    }
    
    public String getMessage(){
        if (message == null){
            message = getGreeting() + " " + getWho() + "!";
        }
        return message;
    }
    
    public String getGreeting() {
        return greeting;
    }
    
    public void setGreeting(String greeting){
        this.greeting = greeting;
    }
    
    public static void main(String[] args) throws Exception {
        Hello app = new Hello();
        app.run();
    }
    
    public void run(){
        System.out.println(getMessage());
    }

    void setlanguage(String language) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}