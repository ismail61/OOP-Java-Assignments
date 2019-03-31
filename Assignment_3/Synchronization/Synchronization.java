/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Multhereading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ismail
 */

public class Synchronization extends Thread {

    public static void main(String[] args) {
        Synchronization ob = new Synchronization();
        Synchronization ob1= new Synchronization();
        ob.start();
        ob1.start();
        
    }
    static synchronized void print()
    {
        
        try {
            for(int i=1;i<=10;i++)
            {
                System.out.println(i);
                Thread.sleep(1000);
            }
            
        } catch (InterruptedException ex) {
            System.out.println("Interrupted Exception");
        }
       
    }
    @Override
     public    void run()
    {
        synchronized(this){
        print();
        }
    }

}

