import java.util.Scanner;
public class MyArrayExternalTester{
	public static void printArray(int [] a){
		System.out.print("[");
		for(int i=0; i<a.length-1;i++) System.out.print(a[i]+", ");
		System.out.println(a[a.length-1]+"]");
	}
	public static void main(String [] args){
		Scanner in = new Scanner (System.in);
		System.out.println("Quanto lungo deve essere l'array?");
		int [] mioArray=new int[in.nextInt()];
		for(int i=0; i<mioArray.length;i++) {
			System.out.println("Inserisci un elemento (intero)");
			mioArray[i]=in.nextInt();
		}
		printArray(mioArray);
		int [] result=MyArrayExternal.external(mioArray);
		printArray(result);
			
	}
}