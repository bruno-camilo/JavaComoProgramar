import java.util.Scanner;
import java.util.Locale;

class AccountTest{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Locale.setDefault(Locale.ENGLISH);
		/* Sem construtor
		Account myAccount = new Account();
		System.out.printf("Initial name is %s%n%n", myAccount.getName());

		System.out.println("Please enter the name:");
		String theName = input.nextLine();
		myAccount.setName(theName);
		System.out.println();

		System.out.printf("Name in object myAccount is:%n%s%n", myAccount.getName());
		*/

		Account account1 = new Account("Jane Green", 50.00);
		Account account2 = new Account("Johb Blue",-7.53);

		displayAccount(account1);		
		displayAccount(account2);

		System.out.print("Enter deposit amount for account1: ");
		double depositAmount = input.nextDouble();

		System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
		account1.deposit(depositAmount);

		displayAccount(account1);		
		displayAccount(account2);

		System.out.print("Enter deposit amount for account2: ");
		depositAmount = input.nextDouble();

		System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
		account2.deposit(depositAmount);
		
		displayAccount(account1);		
		displayAccount(account2);



		/*
		System.out.printf("Account1 name is:%s%n",account1.getName());
		System.out.printf("Account2 name is:%s%n",account2.getName());
		*/

		input.close();
	}

	public static void displayAccount(Account accountToDisplay){
		System.out.printf("%s balance: %.2f %n", accountToDisplay.getName(), accountToDisplay.getBalance());
	}
}