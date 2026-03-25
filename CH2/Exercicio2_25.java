import java.util.Scanner;

class Exercicio2_25{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();

		if(number % 2 == 0)
		System.out.printf("Number %d is Even", number);
		else
		System.out.printf("Number %d is Odd", number);

		input.close();
	}
}