/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.throw_and_throws;

/**
 *
 * @author user
 */
public class ThrowsExample{ 
   int divion(int a, int b) throws ArithmeticException{ 
                int intet = a/b;
                return intet;
   } 
   public static void main(String args[]){ 
                ThrowsExample obj = new ThrowsExample();
                try{
                   System.out.println(obj.divion(15,0)); 
                }
                catch(ArithmeticException e){
                   System.out.println("Division cannot be done using ZERO");
                }

   } 
}