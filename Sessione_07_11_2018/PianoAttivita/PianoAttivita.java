public class PianoAttivita{
	
	final static double settAnno= 52.1429; //quante settimane ci sono in un anno
	int oreGiorno;
	int giorniSettimana;
	int numSettimaneVacanza;
	
	public PianoAttivita(int oreGiorno, int giorniSettimana, int numSettimaneVacanza){
		this.oreGiorno=oreGiorno;
		this.giorniSettimana=giorniSettimana;
		this.numSettimaneVacanza=numSettimaneVacanza;
	}

	public double calcola(int totOre){
		return totOre/((settAnno-numSettimaneVacanza)*giorniSettimana*oreGiorno);
	}
	
}