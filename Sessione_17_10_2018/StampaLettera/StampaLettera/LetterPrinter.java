
/**
 * La classe Letter Printer utilizza la classe LinePrinter per stampare la lettera R maiuscola fatta di *
 * 
 * @author Matteo Mognato 
 * @version 1.0 
 * @data 15/10/2018
 */
public class LetterPrinter
{
    public static void main(String [] args){
        //Scelto la lettera R di Rosanna
        LinePrinter p=new LinePrinter();
        p.unSegmento(1,13);
        p.unSegmento(1,14);
        p.dueSegmenti(1, 4, 10, 14);
        p.dueSegmenti(1, 4, 10, 14);
        p.dueSegmenti(1, 4, 9, 13);
        p.dueSegmenti(1, 5, 7, 12);
        p.unSegmento(1,11);
        p.dueSegmenti(1, 4, 9, 12);
        p.dueSegmenti(1, 4, 10, 13);
        p.dueSegmenti(1, 4, 11, 14);
        p.dueSegmenti(1, 5, 12, 15);
        
    }
}
