import java.util.Scanner;

 class Main {

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 0;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        if(n == 1) {
            System.out.println(1);
        } else {

            for(int i=1; i<n; i++) {
                c = a + b;
                a = b;
                b = c;
            }

            System.out.println(c);
        }
    }
}