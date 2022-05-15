import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> leftStack = new Stack();
        Stack<Character> rightStack = new Stack();
        String str = br.readLine();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < str.length(); i++) {
            leftStack.push(str.charAt(i));
        }
        while (N-- > 0) {
            String command = br.readLine();
            if (command.charAt(0) == 'L' && !leftStack.empty()) {
                rightStack.push(leftStack.pop());
            } else if (command.charAt(0) == 'D' && !rightStack.empty()) {
                leftStack.push(rightStack.pop());
            } else if (command.charAt(0) == 'B' && !leftStack.empty()) {
                leftStack.pop();
            } else if (command.charAt(0) == 'P') {
                leftStack.push(command.charAt(2));
            }
        }
        while(!leftStack.empty()){
            rightStack.push(leftStack.pop());
        }
        while(!rightStack.empty()){
            sb.append(rightStack.pop());
        }
        System.out.println(sb);
        }

    }

