import javax.swing.JOptionPane;
/**
 * Generalizziamo il problema di fibonacci ad n qualunque
 * 
 * @author Matteo Mognato
 * @version 1.0
 */
public class Fibonacci
{
    //esempio con la ricorsione
    /*public static long calcolaFibonacci(long n){
        return n==1||n==2? 1: calcolaFibonacci(n-1)+calcolaFibonacci(n-2);
    }
    */
    //esempio iterativo
    public static long calcolaFibonacci(long n){
        long ris=1;
        long f1=1,f2=1;
        for (int i=2; i<n; i++){
            ris=f1+f2;
            f1=f2;
            f2=ris;
        }
        return ris;
    }
    
    public static void main(String [] args){
        JOptionPane j=new JOptionPane();
        String input = j.showInputDialog("Inserisci num x calcolare"
        +"fibonacci");
        final int n=Integer.parseInt(input);
        j.showMessageDialog(null, "Fibonacci di "+n+" = "+calcolaFibonacci(n));
    }
}
