import java.io.*;
import java.util.*;

 class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        String str = br.readLine();
        double[] arr = new double[cnt];
        Stack<Double> stack = new Stack();

        for (int i = 0; i < cnt; i++) {
            arr[i] = Double.parseDouble(br.readLine());
        }

        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if (temp >= 'A' && 'Z' >= temp) {
                stack.push(arr[temp - 'A']);
            } else {
                if (!stack.empty()) {
                    double num1 = stack.pop();
                    double num2 = stack.pop();
                    switch (str.charAt(i)) {
                        case '*':
                            stack.push(num2*num1);
                            continue;
                        case '/':
                            stack.push(num2/num1);
                            continue;
                        case '+':
                            stack.push(num2+num1);
                            continue;
                        case '-':
                            stack.push(num2-num1);
                            continue;
                    }
                }
            }
        }
        System.out.printf("%.2f",stack.pop());
    }
}

