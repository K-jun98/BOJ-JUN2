import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] ints = new int[2];
        int N = 3;
        while (N--!=0) {
            st = new StringTokenizer(br.readLine(), " ");
            Arrays.fill(ints,0);
            for (int i = 0; i < 4; i++) {
                ints[Integer.parseInt(st.nextToken())]++;
            }
            if (ints[0] == 1) {
                System.out.println("A");
            } else if (ints[0] == 2) {
                System.out.println("B");
            } else if (ints[0] == 3) {
                System.out.println("C");
            } else if (ints[0] == 4) {
                System.out.println("D");
            }else if (ints[0] == 0) {
                System.out.println("E");
            }
        }
    }

}