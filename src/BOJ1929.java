import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        int M=Integer.parseInt(st.nextToken());
        int N=Integer.parseInt(st.nextToken());
        int[] arr= new int[N+1];
        for(int i=2;i<=Math.sqrt(N);i++){
            if(arr[i]==0){
                for(int j=i*2;j<=N;j+=i){
                    arr[j]=1;
                }
          }
        }
        arr[0]=1;
        arr[1]=1;
        for(int i=M;i<=N;i++){
            if(arr[i]==0)
            System.out.println(i);
        }
    }
}

