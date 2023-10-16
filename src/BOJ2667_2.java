import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static boolean[][] arr;
    static boolean[] arr1;

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int L = Integer.parseInt(br.readLine());

        arr = new boolean[T + 1][T + 1];
        arr1 = new boolean[T + 1];

        for (int i = 0; i < L; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            arr[A][B] = true;
            arr[B][A] = true;
        }
        arr1[1] = true;
        check(1);

        int answer = -1;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == true) {
                answer++;
            }
        }
        System.out.println(answer);
    }

    public static void check(int y) {

        for (int i = 1; i < arr.length; i++) {
            boolean b = arr[y][i];

            if (b && arr1[i] == false) {
                arr[y][i] = false;
                arr[i][y] = false;
                arr1[i] = true;
                check(i);
            }
        }
    }
}
