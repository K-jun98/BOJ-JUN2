import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] ints = new int[N];
        st=new StringTokenizer(br.readLine());
        for (int i = 0; i <N; i++) {
            ints[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(ints);
        int sum=0;
        for (int i = 0; i <N; i++) {
            for (int j = 0; j <= i; j++) {
                sum+=ints[j];
            }

        }
        System.out.println(sum);
    }
}