import java.util.Scanner;

class Exercicio2_24{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int number1 = input.nextInt();

		System.out.print("Enter second number: ");
		int number2 = input.nextInt();

		System.out.print("Enter third number: ");
		int number3 = input.nextInt();

		System.out.print("Enter fourth number: ");
		int number4 = input.nextInt();

		System.out.print("Enter fifth number: ");
		int number5 = input.nextInt();


		int min = number1;
		int max = number1;

		if(number2 > max)
			max = number2;

		if(number3 > max)
			max = number3;

		if(number4 > max)
			max = number4;

		if(number5 > max)
			max = number5;

		if(number2 < min)
			min = number2;

		if(number3 < min)
			min = number3;

		if(number4 < min)
			min = number4;

		if(number5 < min)
			min = number5;

		System.out.printf("Max is %d%nMin is %d%n", max, min);
		input.close();
	}
}