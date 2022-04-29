import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int result=0;
        for (int i = 0; i < num; i++) {
            int N = i;
            int sum = 0;
            while (N != 0) {
                sum += N % 10;
                N /= 10;
            }
            if (sum + i == num) {
                result=i;
                System.out.println(result);
                return;

            }
        }
        System.out.println(0);
    }
}