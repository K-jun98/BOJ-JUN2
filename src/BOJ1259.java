import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {

            String tmp = br.readLine();
            if (tmp.equals("0")) {
                break;
            } else if (!tmp.equals("0")) {
                rom(tmp);
            }

        }
    }


    public static void rom(String str) {
        String reverse = new StringBuffer(str).reverse().toString();
        if (str.equals(reverse)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
