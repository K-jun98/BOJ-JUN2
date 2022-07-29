import java.util.Scanner;
public class Main {
    static int[][] resultArray = null;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = Integer.parseInt(scan.nextLine().trim());

        System.out.println((M * N) - 1);

        scan.close();
    }
}