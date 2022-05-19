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
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < N - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                arr[i] = arr[i + 1];
                while (!stack.empty()) {
                    if (arr[stack.peek()] < arr[i + 1]) {
                        arr[stack.pop()] = arr[i + 1];
                    } else {
                        break;
                    }
                }
            } else
                stack.push(i);
        }
        while (!stack.empty()) {
            arr[stack.pop()] = -1;
        }
        arr[arr.length - 1] = -1;
        for (int i : arr) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
    }
}