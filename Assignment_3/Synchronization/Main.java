// Java program to demonstrate working of extended 
// Euclidean Algorithm 


public class Main {
public static int gov_var = 15;
   public static void main(String args[]) throws InterruptedException
    {
        miltiThreading_1 t1 = new miltiThreading_1("one");
        miltiThreading_1 t2 = new miltiThreading_1("two");
        Thread th1 = new Thread(t1);
        th1.start();
        Thread th2 = new Thread(t2);
        th2.start();
        
    }
}