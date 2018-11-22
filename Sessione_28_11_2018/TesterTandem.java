public class TesterTandem{
	public static void main(String [] args){
		String x="bicibici";
		String y="bicimoto";
		if(MyString.isTandem(x)) System.out.println("La parola "+x+" e' un tandem");
		else System.out.println("La parola "+x+" NON e' un tandem");
		if(MyString.isTandem(y)) System.out.println("La parola "+y+" e' un tandem");
		else System.out.println("La parola "+y+" NON e' un tandem");
		 
	}
}
		 