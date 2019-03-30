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
public class finally_try_catch
{ 
    public static void main (String[] args) 
    { 
            int[] arr = new int[4]; 

            try
            { 
                    arr[4] = 2;
                    System.out.println("Inside try block"); 
            } 
            catch(NullPointerException ex) 
            { 
                    System.out.println("Exception has been caught"); 
            } 
            finally
            { 
                System.out.println("finally block executed"); 
            }  
            System.out.println("Outside try-catch-finally clause"); 
    } 
} 
