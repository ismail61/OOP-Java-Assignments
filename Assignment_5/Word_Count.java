/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.class1;

/**
 *
 * @author Ismail hosen raj
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
public class Word_Count {
    public static void main(String[] args) {
        countword("C:/Users/user/Desktop/hi.txt");
    }

    public static void countword(String Name) {
        BufferedReader buf = null;
        String line = " ";
        int cnt = 0 ;
        try {
            buf = new BufferedReader(new FileReader(Name));
            while ((line = buf.readLine()) != null) {
                String[] words = line.split(" ");
                cnt = cnt + words.length;
            }
            System.out.println("Number of words is : "+ cnt);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException io) {
            io.printStackTrace();
        }
        finally {
            try {
                if(null != buf) {
                    buf.close();
                }
            } 
            catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}