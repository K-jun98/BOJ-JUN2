import java.util.Scanner;

class BOJ1065 {

    static int count = 99;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = han(sc.nextInt());
        System.out.println(count);

    }

    public static int han(int a) {
        if (a == 1000) {   //1000까지이지만 1000은 한수가 아님.
            a = 999;
        }
        if (a < 100) {
            count = a;
        } else if (a >= 100 && a < 1000) {
            for (int i = 100; i <= a; i++) {
                if (((i / 100) - (i / 10 % 10)) == ((i / 10 % 10) - (i % 10)))
                    count++;
            }
        }
        return count;
    }
}

