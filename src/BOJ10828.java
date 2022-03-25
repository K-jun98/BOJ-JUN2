import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

 class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack stack = new Stack();
        StringBuffer sb=new StringBuffer();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String order = st.nextToken();


            if ("push".equals(order)) {
                stack.push(st.nextToken());
            }
            if ("pop".equals(order)) {
                sb.append(stack.size() == 0 ? "-1" : stack.pop()).append("\n");
            }
            if ("size".equals(order)) {
                sb.append(stack.size()).append("\n");
            }
            if ("empty".equals(order)) {
                sb.append(stack.size() == 0 ? "1" : "0").append("\n");
            }
            if ("top".equals(order)) {
                sb.append(stack.size() == 0 ? "-1" : stack.peek()).append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}




