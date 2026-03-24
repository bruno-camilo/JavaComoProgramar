import java.util.Scanner;

/*
	 (Aritmética) Escreva um aplicativo que solicite ao usuário inserir dois inteiros, obtenha dele esses números e imprima sua soma, produto,
diferença e quociente (divisão). Utilize as técnicas mostradas na Figura 2.7.
*/


class Exercicio2_15{

	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		int number1, number2, sum, product, difference, quotient;

		System.out.print("Enter first number: ");
		number1 = input.nextInt();

		System.out.print("Enter second number: ");
		number2 = input.nextInt();

		sum = number1 + number2;
		product = number1 * number2;
		difference = number1 - number2;
		quotient = number1 / number2;


		System.out.printf("Sum is %d%n", sum);
		System.out.printf("Product is %d%n", product);
		System.out.printf("Difference is %d%n", difference);
		System.out.printf("Quotient is %d%n", quotient);


		input.close();

	}
}