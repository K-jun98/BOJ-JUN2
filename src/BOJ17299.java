import java.util.*;
import java.io.*;


class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        int[] cnt = new int[1_000_001];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < N; i++) {
            cnt[arr[i]]++;
        }
        for (int i = 0; i < N; i++) {
            while (!stack.empty() && cnt[arr[stack.peek()]] < cnt[arr[i]]) {
                arr[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
        while (!stack.empty()) {
            arr[stack.pop()] = -1;
        }
        for (int i : arr) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
    }
}