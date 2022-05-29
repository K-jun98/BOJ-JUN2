import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] arr = new boolean[1_000_001];

        for (int i = 2; i <= 1_000_000; i++) {
            if (!arr[i]) {
                for (int j = i * 2; j < 1_000_000; j = j + i) {
                    arr[j] = true;
                }
            }
        }

        while (true) {
            boolean check = false;
            int N = Integer.parseInt(br.readLine());
            if (N == 0)
                break;
            for (int i = 2; i <= N / 2; i++) {
                if (!arr[i]&& !arr[N - i]) {
                    System.out.println(N + " = " + i + " + " + (N - i));
                    check = true;
                    break;
                }
            }
            if (!check)
                System.out.println("Goldbach's conjecture is wrong.");
        }


    }
}