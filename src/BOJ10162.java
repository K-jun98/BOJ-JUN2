import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int a;
    static int b;
    static int c;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        a = 0;
        b=0;
        c=0;
        if (n % 10 != 0) {
            System.out.print(-1);
            return;
        }
        f(n);
        System.out.print(a + " " + b + " " + c);

    }

    static void f(int n) {
        if (n == 0) return;
        if (n >= 300) {
            n-= 300;
            a++;
            f(n);
        } else if (n >= 60) {
            n-=60;
            b++;
            f(n);
        } else {
            n-= 10;
            c++;
            f(n);
        }
    }
}