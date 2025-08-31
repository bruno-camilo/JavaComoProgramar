import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fatorial = 1;

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if(number <= 0)
            System.out.println("Number invalid");

        while (number >= 1){
            fatorial *= number;
            number--;
        }

        System.out.println(fatorial);
    }
}
