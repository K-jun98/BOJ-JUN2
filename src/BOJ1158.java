import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        Queue<Integer> queue = new ArrayDeque();
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }
        sb.append("<");
        while (!queue.isEmpty()) {
            for (int i = 1; i <= K; i++) {
                if (i == K) {
                    sb.append(queue.poll());
                    if(queue.size()!=0){
                        sb.append(", ");
                    }
                } else {
                    queue.add(queue.poll());
                }
            }
        }
        sb.append(">");
        System.out.println(sb);

    }

}



