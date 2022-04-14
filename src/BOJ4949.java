import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = br.readLine();
            Stack<Character> st = new Stack<>();
            if(String.valueOf('.').equals(str))
                break;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '(' || str.charAt(i) == '[') {
                    st.push(str.charAt(i));
                } else if (str.charAt(i) == ')') {
                    if (!st.isEmpty() && st.peek() == '(') {
                        st.pop();
                    } else {
                        st.push(str.charAt(i));
                        break;
                    }
                } else if (str.charAt(i) == ']') {
                    if (!st.isEmpty() &&  st.peek() == '[') {
                        st.pop();
                    } else {
                        st.push(str.charAt(i));
                        break;
                    }
                }
            }
            if (st.isEmpty())
                System.out.println("yes");
else
                System.out.println("no");
        }
    }
}