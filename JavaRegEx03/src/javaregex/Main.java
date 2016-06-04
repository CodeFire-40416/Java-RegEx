/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author human
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String line = "Hello World! I'm Pupkin and I'm 21 years old. +380 67 1234567; +380 67 1234567";
        
        Pattern pattern = Pattern.compile("\\+?(?<country>\\d{3})\\s*\\(?(?<oper>\\d{2})\\)?\\s*(?<number>\\d{3}(\\-?\\d{2}){2})");
        
        Matcher matcher = pattern.matcher(line);
        
        while (matcher.find()) {
            String group = matcher.group();
            String country = matcher.group("country");
            String operator = matcher.group("oper");
            String number = matcher.group("number");
            
            System.out.println(group);
            System.out.println("Country: " + country);
            System.out.println("Operator: " + operator);
            System.out.println("Number: " + number);
        }
        
    }
    
}
