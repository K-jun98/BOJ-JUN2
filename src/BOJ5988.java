import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            BigInteger k = sc.nextBigInteger();

            System.out.println(k.remainder(BigInteger.valueOf(2)).equals(BigInteger.valueOf(0)) ? "even" : "odd");

        }

        sc.close();
    }
}