import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack();
        int cnt=0;
        while(N-- > 0){
            int value=Integer.parseInt(br.readLine());
            if (value > cnt) {
                for (int i = cnt+1; i <=value ; i++) {
                    stack.push(i);
                    sb.append("+").append("\n");
                }
                cnt=value;
            }else if(stack.peek()!=value){
                System.out.printf("NO");
                return;
            }
            stack.pop();
            sb.append("-").append("\n");

        }
        System.out.println(sb);
        }

    }