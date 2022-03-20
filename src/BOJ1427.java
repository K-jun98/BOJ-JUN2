import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//백준 1427
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String str=br.readLine();
       char[] ch = str.toCharArray();
       Arrays.sort(ch);

        System.out.println(new StringBuilder(String.valueOf(ch)).reverse());
    }
}

