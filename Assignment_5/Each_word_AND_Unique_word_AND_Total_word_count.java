/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

//package javaapplication7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
 
public class Each_word_AND_Unique_word_AND_Total_word_count {
    public static void main(String[] args) {
        countword("C:/Users/IICT (SWE)/Desktop/hii.txt");
    }

    public static void countword(String Name) {
        BufferedReader buf = null;
        String line = " ";
        ArrayList<Integer> a = new ArrayList<Integer>();
        int cnt = 0 ;int count = 1 ;
        try {
            buf = new BufferedReader(new FileReader(Name));
            while ((line = buf.readLine()) != null) {
                String[] words = line.split(" ");
                cnt = cnt + words.length;
                for(int i=0; i<words.length; i++) {
                    if(words[i].equals("")) continue;
                    for(int j=i+1; j<words.length; j++) {
                        if(words[i].equals(words[j])) {
                            words[j] = "";
                            count++;
                        }
                    } 
                    a.add(count);
                    System.out.println("'" + words[i] + "'" + " is " + count + " times.");
                    words[i] = "";
                    count = 1;
                }
            }
            System.out.println("");
            System.out.println("Number of words is : "+ cnt);
            System.out.println("\nNumber of unique words is : "+ a.size());
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
