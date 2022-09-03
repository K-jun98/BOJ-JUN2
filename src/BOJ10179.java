import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        double[] arr = new double[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextDouble();
            double sum = arr[i] * 80 / 100;
            System.out.println("$" + String.format("%.2f", sum));
        }
    }
}
