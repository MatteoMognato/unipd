import java.util.Scanner;
public class CalendarioTester{
	
	public static void main(String [] args){
		Scanner t=new Scanner(System.in);
		//while(true){ //così posso provarlo
			System.out.println("Dammi giorno-mese-anno");
			String [] x=t.next().split("-");
			Calendario c=new Calendario(Integer.parseInt(x[0]), Integer.parseInt(x[1]), Integer.parseInt(x[2]));
			c.nextDay();
			System.out.println(c);
			System.out.println("Di quanti giorni vuoi spostare il calendario?");
			int n=t.nextInt();
			c.update(n);
			System.out.println(c);
		//}
	}
	
}