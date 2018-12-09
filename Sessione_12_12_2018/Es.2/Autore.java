/*classe semplice che indica un autore*/
public class Autore{
	
	private String nome;
	private String cognome;
	
	public Autore(String unNome, String unCognome){
		nome=unNome;
		cognome=unCognome;
	}
	
	public String getNome(){
		return nome;
	}
	
	public String getCognome(){
		return cognome;
	}
	
	public String toString(){
		return "Autore: "+nome+" "+cognome;
	}
	
	public boolean equals(Autore a){
		return nome.equals(a.nome) && cognome.equals(a.cognome);
	}
}