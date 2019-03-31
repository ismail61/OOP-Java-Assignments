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

public class Synchronization_1 extends Thread{
    String name;
    Synchronization_1(String name) {
        this.name = name;
    }
    synchronized void print(String s) throws InterruptedException{
        if(Main.busy){
            System.out.println(s+" waiting");
            wait();
        }
        Main.busy = true;
        for (int i = 0; i < 10; i++) {
            System.out.println(s+ " running.");
            Thread.sleep(50);
        }
        Main.busy = false;
        notify();
    }
    @Override
    public void run() {
        try {
            print(name);
        } catch (InterruptedException ex) {
            System.out.println("Interrupted");
        }
    }
}
