import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class LettoreEBookTester{
	public static void main(String [] args) throws FileNotFoundException{
		LettoreEBook l=new LettoreEBook();
		Scanner in=new Scanner(new File("input.txt")); //file da dove leggo i dati altrimenti rottura scriverli a mano
		while(in.hasNextLine()){
			/* 1.leggo i file li salvo riga per riga su un array di oggetti
			     li separo utilizzando lo split del ";"
			   2.faccio i vari casting, considero di essere sicuro del tipo dell oggetto a priori
			   3.aggiungo il libro al mioEBook */
			Object [] ls=in.nextLine().split(";"); 
			int nPagine=Integer.parseInt( (String) ls[1] );
			l.aggLibro((String)ls[0], nPagine,(String)ls[2], (String) ls[3]);
		}
		System.out.println(l);
	}
}