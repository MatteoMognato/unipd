public class MyArraySplitTester{
	public static void main(String [] args){
		int [] a={4, 13, 18, 7, 5, 8};
		System.out.println("faccio lo split ... " );
		int [] ris=MyArraySplit.split(a);
		System.out.print("a   : " );
		for(int i=0; i<ris.length; i++) System.out.print(a [i]+" , " );
		System.out.print("\nris : " );
		for(int i=0; i<ris.length; i++) System.out.print(ris [i]+" , " );
	}
}