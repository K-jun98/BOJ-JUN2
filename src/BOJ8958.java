import java.io.*;



public class BOJ8958 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int val = Integer.parseInt(br.readLine());
        int sum = 0;
        int cnt=0;
        for (int j = 0; j < val; j++) {
            String str=br.readLine();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'O') {
                    cnt++;
                    sum+=cnt;
                } else
                    cnt = 0;
                }
            bw.write(sum+"\n");
            sum=0;
cnt=0;
        }
        bw.flush();
    }
}