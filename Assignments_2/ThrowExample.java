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
public class ThrowExample{ 

   void Vot(int age){ 
                   if(age<18) 
                      throw new ArithmeticException("you can't vote as not Eligible to  vote"); 
                   else 
                      System.out.println("Eligible for voting"); 
   } 
   public static void main(String args[]){ 
                   ThrowExample obj = new ThrowExample();
                   obj.Vot(13); 
                   System.out.println("End Of Program"); 
   } 
}