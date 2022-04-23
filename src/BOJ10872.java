import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N= Integer.parseInt(br.readLine());
        int Na=1;
        if(N<=0){
            System.out.println(Na);
        }else if(N>0){
            for(int i=1;i<=N;i++){
                Na*=i;
            }
            System.out.println(Na);
        }



    }
}