import java.io.*;
import java.util.StringTokenizer;


public class BOJ4344 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int testcase = Integer.parseInt(br.readLine());


        for (int i = 0; i < testcase; i++) {

            st = new StringTokenizer(br.readLine());
            int cnt = Integer.parseInt(st.nextToken());
            int[] arr = new int[cnt];
            double sum = 0;

            for (int j = 0; j < cnt; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
                sum += arr[j];
            }
            double averege = sum/cnt;
            double count = 0;

            for (int k = 0; k < cnt; k++) {
                if (arr[k] > averege) {
                    count++;
                }
            }

            System.out.printf("%.3f%%\n",(count/cnt)*100);
        }

    }
}