public class Calendario{
	
	private int g, m, a; //giorno, mese, anno
	
	public Calendario(int g, int m, int a){
		this.g=g;
		this.m=m;
		this.a=a;
	}
	
	public void nextDay(){
		/*
			1	2	3	4	5	6	7	8	9	10	11	12
			G	F	M  	A   M   G   L   A   S   O   N   D
			31	28	31	30	31	30	31	31	30	31	30	31
		*/
		if((g==30 && m==4||m==6||m==9||m==11) || (g==31 && m!=12)){ //mesi da 30 giorni o da 31 
			g=1;
			m++;
		}
		else if(g==28 && m==2){
			g=1;
			m++;
		}
		else if(g==31&&m==12){
			g=1;
			m=1;
			a++;
		}
		else g++;
	}
	
	public int getGiorno(){ return g;}
	public int getMese(){ return m;}
	public int getAnno(){ return a;}
	
	@Override
	public String toString(){
		return "Oggi e' il "+g+"/"+m+"/"+a;
	}
	
}
