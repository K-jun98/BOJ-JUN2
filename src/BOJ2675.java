import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            int testcase = sc.nextInt();
            String str = sc.next();
            for (int j = 0; j < str.length(); j++)
                for (int k = 0; k < testcase; k++) {
                    System.out.print(String.valueOf(str.charAt(j)));
                }
            System.out.println();
        }


    }
}
