import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


 class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int sum=1;
        int i=0;
        for( i =0;;i++){
            sum+= i*6;
            if(N<=sum) {
                System.out.println(i+1);
                break;
            }
        }
    }
}