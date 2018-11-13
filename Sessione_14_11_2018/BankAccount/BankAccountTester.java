import java.util.Scanner;

public class BankAccountTester{
	
	public static void main(String [] args) {
		Scanner t=new Scanner(System.in);
		System.out.println("Da quale cifra vuoi che cominci il tuo conto??");
		double initialBalance = t.nextDouble();
		BankAccount b=new BankAccount(initialBalance);
		boolean isExit=false;
		while(!isExit){
			System.out.println("Scegli un opzione \n 1) Prelievo \n 2) Versamento \n 3) Saldo \n 4) Exit");
			int scelta=t.nextInt();
			switch (scelta){
				case 1: {
					System.out.println("Quanto vuoi prelevare?");
					double x=t.nextDouble();
					b.withdraw(x);
					break;
				}
				case 2: {
					System.out.println("Quanto vuoi versare?");
					double x=t.nextDouble();
					b.deposit(x);
					break;
				}
				case 3: System.out.println("Il saldo è  "+ b.getBalance()); break;
				case 4: break;
			}
			isExit = scelta==4;
		}
	}
}	
			