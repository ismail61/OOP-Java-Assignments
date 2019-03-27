
package multithread;

public class Threading1 {
    public static void main(String args[])
    {
        Arrays arr = new Arrays();
        
        Subthread t = new Subthread();
        t.start();
        
        for(int i=0; i<10; i++)
        {
            arr.E[i] = arr.A[i]+arr.B[i];
        }
        try {
            t.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Threading1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for(int i=0; i<10; i++)
        {
            arr.G[i]=arr.E[i]+arr.F[i];
        }
        
        for(int i=0; i<10; i++)
        {
            System.out.println(arr.G[i]);
        }
    }
    
}
