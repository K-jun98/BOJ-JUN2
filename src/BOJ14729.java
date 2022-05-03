import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue arr = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue arr2 = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            double num = Double.parseDouble(br.readLine());
            if (i > 7 && (double) arr.peek() > num) {
                arr.remove();
                arr.add(num);
            }
            else if (i <= 7)
                arr.add(num);
        }
        arr2.addAll(arr);
        for(int i = 0; i < 7; i++) {
            System.out.println(String.format("%.3f", arr2.poll()));
        }
    }
}
