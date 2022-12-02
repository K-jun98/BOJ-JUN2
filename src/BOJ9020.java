import static java.lang.System.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(in);

        int N = 10000;

        final boolean[] check = new boolean[N + 1];
        for (int i = 2; i <= N; i++) {
            check[i] = true;
        }

        for (int i = 2; i <= Math.sqrt(N); i++) {
            for (int j = i + i; j <= N; j += i) {
                check[j] = false;
            }
        }

        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int tmp = n / 2;

            for (int j = tmp; j >= 2; j--) {
                if (check[j] && check[n - j]) {
                    out.println(j + " " + (n - j));
                    break;
                }
            }
        }
    }
}