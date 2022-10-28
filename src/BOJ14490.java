import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int m;
    static String[] splited;
    static int gcd;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        splited = br.readLine().split(":");

        n = Integer.parseInt(splited[0]);
        m = Integer.parseInt(splited[1]);


        gcd = gcd(Math.max(n, m), Math.min(n, m));


        System.out.println(n / gcd + ":" + m / gcd);
    }


    static int gcd(int a, int b) {
        if (b == 0)
            return a;

        return gcd(b, a % b);
    }
}