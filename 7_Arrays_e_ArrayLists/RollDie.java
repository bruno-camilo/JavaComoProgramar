import java.security.SecureRandom;

public class RollDie {
    public static void main(String[] args) {
        SecureRandom randomNumber = new SecureRandom();
        int[] frequency = new int[7];

        for (int i = 0; i < 6000000; i++)
            ++frequency[1 + randomNumber.nextInt(6)];

        System.out.printf("%s%10s%n", "Face", "Frequency");

        for (int i = 1; i < frequency.length ; i++)
            System.out.printf("%4d%10d%n", i, frequency[i]);
    }
}
