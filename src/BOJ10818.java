import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


public class BOJ10818 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int a = Integer.parseInt(br.readLine());

     int[] arr = new int[a];
        st = new StringTokenizer(br.readLine());

     for(int i= 0;i<a;i++){
         arr[i]= Integer.parseInt(st.nextToken());
     }
     Arrays.sort(arr);
        System.out.println(arr[0]+" "+arr[a-1]);
    }
}