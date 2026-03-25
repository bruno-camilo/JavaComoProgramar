import java.util.Scanner;
import java.util.Locale;

class Exercicio3_11{
	
	public static void main(String[] args){
		Locale.setDefault(Locale.ENGLISH);
		Scanner input = new Scanner(System.in);
	
		Account account1 = new Account("Jane Green", 50.00);
		Account account2 = new Account("Johb Blue",-7.53);

		System.out.printf("%s balance: %.2f %n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: %.2f %n", account2.getName(), account2.getBalance());

		System.out.print("Enter deposit amount for account1: ");
		double depositAmount = input.nextDouble();

		System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
		account1.deposit(depositAmount);

		System.out.printf("%s balance: %.2f %n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: %.2f %n", account2.getName(), account2.getBalance());

		System.out.print("Enter deposit amount for account2: ");
		depositAmount = input.nextDouble();

		System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
		account2.deposit(depositAmount);
				
		System.out.printf("%s balance: %.2f %n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: %.2f %n", account2.getName(), account2.getBalance());

		System.out.print("Enter withdrawal amount for account1: ");
		double withDrawal = input.nextDouble();

		System.out.printf("%nremoving %.2f to account1 balance%n%n", withDrawal);
		account1.withDrawal(withDrawal);

		System.out.printf("%s balance: %.2f %n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: %.2f %n", account2.getName(), account2.getBalance());

		System.out.print("Enter withdrawal amount for account2: ");
		withDrawal = input.nextDouble();

		System.out.printf("%nremoving %.2f to account2 balance%n%n", withDrawal);
		account2.withDrawal(withDrawal);

		System.out.printf("%s balance: %.2f %n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: %.2f %n", account2.getName(), account2.getBalance());

		input.close();
	}
}
