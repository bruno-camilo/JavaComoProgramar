import java.util.Scanner;

class Exercicio2_26{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int number1 = input.nextInt();

		System.out.print("Enter second number: ");
		int number2 = input.nextInt();

		if(number1 % number2 == 0){
			System.out.printf("%d is multiple of %d", number1, number2);
		}else{
			System.out.printf("%d is not multiple of %d", number1, number2);
		}


		input.close();
	}

}