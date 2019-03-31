/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Multhereading;

/**
 *
 * @author user
 */

public class Main {

    static boolean busy = false;

    

    public static void main(String[] args) throws InterruptedException{
        Synchronization_1 obj = new Synchronization_1("one");
        Synchronization_1 obj1 = new Synchronization_1("two");
        obj.start();
        obj1.start();

    }

}