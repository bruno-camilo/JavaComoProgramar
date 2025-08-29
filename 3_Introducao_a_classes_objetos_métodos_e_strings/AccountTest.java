import java.util.Scanner;
import java.util.Locale;

public class AccountTest{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        double depositAmount;
		Account account1 = new Account("Jane Green", 50.00);
		Account account2 = new Account("John Blue", -7.53);
		
		displayAccount(account1);
		displayAccount(account2);

		System.out.print("Enter deposit amount for account1: ");
		depositAmount = input.nextDouble();
		System.out.printf("%nadding: $%.2f to account1 balance %n%n", depositAmount, account1.getBalance());
		account1.deposit(depositAmount);
		displayAccount(account1);
		displayAccount(account2);


		System.out.print("Enter deposit amount for account2: ");
		depositAmount = input.nextDouble();
		System.out.printf("%nadding: $%.2f to account2 balance %n%n", depositAmount, account2.getBalance());
		account2.deposit(depositAmount);
		displayAccount(account1);
		displayAccount(account2);
	}

	public static void displayAccount(Account account){
		System.out.printf("%s balance:$%.2f%n", account.getName(), account.getBalance());
	}
}