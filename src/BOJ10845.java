import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue queue = new ArrayDeque();
        StringBuffer sb=new StringBuffer();
        int num=0;
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String order = st.nextToken();


            if ("push".equals(order)) {
                num=Integer.parseInt(st.nextToken());
                queue.add(num);
            }
            if ("pop".equals(order)) {
                sb.append(queue.size() == 0 ? "-1" : queue.remove()).append("\n");
            }
            if ("size".equals(order)) {
                sb.append(queue.size()).append("\n");
            }
            if ("empty".equals(order)) {
                sb.append(queue.size() == 0 ? "1" : "0").append("\n");
            }
            if ("front".equals(order)) {
                sb.append(queue.size() == 0 ? "-1" : queue.peek()).append("\n");
            }
            if ("back".equals(order)) {
                sb.append(queue.size() == 0 ? "-1" : num).append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}




