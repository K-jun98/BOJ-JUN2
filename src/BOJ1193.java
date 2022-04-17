import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


 class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());

        int L=0; // 몇번째 줄인지
        int S=0; // 그 줄까지 분수갯수의 합
        while(true){
            L++;
            S+=L;
            if(N<=S){   //그 행에 내가 원하는 번째 분수가 있을때
                if(L%2==0){
                    System.out.println((N-S+L)+"/"+(S-N+1));
                    break;
                } else{
                    System.out.println((S-N+1)+"/"+(N-S+L));
                break;
                }
            }
        }
    }
}