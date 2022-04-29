import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;



class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
            int max = 0;
            for (int i= 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    for (int k =  j+ 1; k < N; k++) {
                        int temp=arr[i] + arr[j] + arr[k];
                        if (temp<=M&&temp>=max)
                            max=temp;
                    }
                }
            }
            System.out.println(max);
        }
    }





