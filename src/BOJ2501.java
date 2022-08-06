import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int p = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        int cnt = 0;
        for (int i = 1; i <= p; i++){
            if(p%i==0){
                cnt++;
                if(cnt==q){
                    sb.append(i);
                    break;
                }
            }else{
                continue;
            }

        }
        if (sb.length() != 0)
            System.out.println(sb);
        else {
            System.out.println("0");
        }
    }
}
