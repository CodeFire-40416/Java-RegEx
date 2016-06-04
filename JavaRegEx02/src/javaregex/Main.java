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
        
        String line = "Hello World! I'm Pupkin and I'm 21 years old. 100 45 22";
        
        Pattern pattern = Pattern.compile("\\d{1,2}");
        
        Matcher matcher = pattern.matcher(line);
        
        while (matcher.find()) {
            String group = matcher.group();
            
            System.out.println(group);
        }
        
    }
    
}
