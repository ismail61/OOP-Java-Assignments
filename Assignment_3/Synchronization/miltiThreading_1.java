
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ismail
 */
public class miltiThreading_1 implements Runnable{
    String threadName = "";
    synchronized public static void operatin(int add)
    {
        Main.gov_var += add;
    }

    miltiThreading_1(String name) {
        this.threadName = name;
    }
    @Override
    public void run()
    {
        if(threadName.equalsIgnoreCase("one")){
                operatin(5);
            }
            else{
                operatin(-2);
            }
            System.out.println(Main.gov_var);
        for(int i=0; i<10; i++){
            System.out.println("Started");
            if(threadName.equalsIgnoreCase("one")){
                operatin(1);
            }
            else{
                operatin(-1);
            }
            System.out.println(Main.gov_var);
        }
    }
}