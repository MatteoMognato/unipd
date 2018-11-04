import java.util.Scanner;

public class PianoAttivitaTester{
	
	public static void main(String [] args){
		Scanner t=new Scanner(System.in);
		System.out.println("Quante ore al giorno vuoi lavorare?");
		int nOre=t.nextInt();
		System.out.println("Quanti giorni a settimana vuoi lavorare?");
		int nGiorni=t.nextInt();
		System.out.println("Quante settimane di vacanza vuoi?");
		int settVacanza=t.nextInt();
		PianoAttivita p=new PianoAttivita(nOre, nGiorni, settVacanza);
		System.out.println("Quante sono le ore target da raggiungere?");
		int target=t.nextInt();
		System.out.println("Il numero di anni totali necessari sono: "+p.calcola(target));
	}
	
}	