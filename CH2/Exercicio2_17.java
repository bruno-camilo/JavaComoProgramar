import java.util.Scanner;

class Exercicio2_17{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter second number: ");
        int number2 = input.nextInt();

        System.out.print("Enter third number: ");
        int number3 = input.nextInt();

        int sum = number1 + number2 + number3;
        int average = sum / 3;
        int product = number1 * number2 * number3;

        int max = number1;
        int min = number1;

        if(number2 > max)
            max = number2;
        if(number3 > max)
            max = number3;

        if(number2 < min)
            min = number2;
        if (number3 < min)
            min = number3;

        System.out.printf("Sum is %d%nAverage is %d%nProduct is %d%nMax is %d%nMin is %d%n", sum, average, product, max, min);
        input.close();
	}
}