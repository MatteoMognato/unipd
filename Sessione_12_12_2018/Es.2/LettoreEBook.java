import java.util.ArrayList;
/*classe LettoreEBook ha in memoria tutti i libri e gli autori che conosce salvati rispettivamente
su 2 ArrayList<String> */
public class LettoreEBook{
	private ArrayList<Autore> autori;
	private ArrayList<Libro> libri;
	
	public LettoreEBook(){
		autori=new ArrayList<Autore>();
		libri=new ArrayList<Libro>();
	}
	
	private int cercaAutore(String nome, String cognome){
		for(int i=0; i<autori.size(); i++){
			if(autori.get(i).getNome().equals(nome) && 
			   autori.get(i).getCognome().equals(cognome)) return i;
		}
		return -1;
	}
	
	private int cercaLibro(String titolo){
		for(int i=0; i<libri.size();i++)
			if(libri.get(i).getTitolo().equals(titolo)) return i;
		return -1;
	}
	
	public boolean aggLibro(String unTitolo, int unNumeroPagine, 
							String unNome, String unCognome){
		if(cercaLibro(unTitolo)==-1) {
			Libro l;
			if(aggAutore(unNome,unCognome)) l=new Libro(unTitolo, unNumeroPagine, autori.get(autori.size()-1));
			else l=new Libro(unTitolo, unNumeroPagine, autori.get(cercaAutore(unNome, unCognome)));
			libri.add(l);
			return true;
		}
		return false;
	}
	
	public boolean aggAutore(String unNome, String unCognome){
		if(cercaAutore(unNome,unCognome)!=-1) return false;
		Autore a=new Autore(unNome,unCognome);
		autori.add(a);
		return true;
	}
	
	public boolean rimuoviLibro(String unTitolo){
		int pos=cercaLibro(unTitolo);
		if(pos==-1) return false;
		libri.remove(pos);
		return true;
	}
	
	public boolean rimuoviAutore(String unNome, String unCognome){
		int pos=cercaAutore(unNome, unCognome);
		if(pos==-1) return false;
		Autore cercato=autori.get(pos);
		for(int i=0; i<libri.size(); i++) {
			if(libri.get(i).getAutore().equals(cercato)){
				libri.remove(i);
				i--;
			}
		}
		autori.remove(pos);
		return true;
	}
	
	public String toString (){
		String s="";
		for(int i=0; i<autori.size(); i++){
			s+=autori.get(i)+" :\n";
			for(int j=0; j<libri.size(); j++){
				if(libri.get(j).getAutore().equals(autori.get(i))) s+= "   "+libri.get(j)+"\n";
			}
		}
		return s;
	}
	
}
							