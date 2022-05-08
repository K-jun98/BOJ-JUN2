import java.util.Scanner;

 class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();

        long res;

        res = Math.abs(n-m);

        System.out.println(res);
    }

}