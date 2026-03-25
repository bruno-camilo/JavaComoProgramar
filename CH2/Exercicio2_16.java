import java.util.Scanner;

class Exercicio2_16{
	
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		int number1, number2, largest;

		System.out.print("Enter first number: ");
		number1 = input.nextInt();

		System.out.print("Enter second number: ");
		number2 = input.nextInt();

		largest = number1;

		if(number2 > largest)
			largest = number2;
		
		if(number1 == number2)
			System.out.println("These numbers are equal");
		else
			System.out.printf("%d is larger%n", largest);

		input.close();
	}
}