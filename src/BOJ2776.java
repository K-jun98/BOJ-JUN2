import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[] arr1;
    static int[] arr2;

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int j = 0; j < T; j++) {
            int N = Integer.parseInt(br.readLine());
            arr1 = new int[N];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                arr1[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr1);

            int M = Integer.parseInt(br.readLine());
            arr2 = new int[M];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < M; i++) {
                arr2[i] = Integer.parseInt(st.nextToken());
            }

            for (int i = 0; i < M; i++) {
                sb.append(binarySearch(arr1, arr2[i]) ? "1\n" : "0\n");
            }
        }

        System.out.print(sb.toString());
    }

    public static boolean binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] < target) {
                low = mid + 1;
            } else if (arr[mid] == target) {
                return true;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}
