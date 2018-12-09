/*classe semplice per Libro */
public class Libro{
	private String titolo;
	private int numeroPagine;
	private Autore autore; //si assume solo un autore 
	
	Libro(String titolo, int numeroPagine, Autore autore){
		this.titolo=titolo;
		this.numeroPagine=numeroPagine;
		this.autore=autore;
	}
	
	public String getTitolo(){
		return titolo;
	}
	
	public int getNumeroPagine(){
		return numeroPagine;
	}
	
	public Autore getAutore(){
		return autore;
	}
	
	public String toString (){
		return "Libro: "+titolo+" n# Pagine: "+numeroPagine+" "+autore;
	}

}