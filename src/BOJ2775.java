import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[][] arr = new int[15][15];
        for (int n = 0; n < 15; n++) {
            arr[n][1] = 1;
        }
        for (int k = 1; k < 15; k++) {
            arr[0][k] = k;
        }
        for (int n = 1; n < 15; n++) {
            for (int k = 2; k < 15; k++) {
                arr[n][k] = arr[n][k - 1] + arr[n - 1][k];
            }
        }
            for (int i = 0; i < T; i++) {
                int a = Integer.parseInt(br.readLine());
                int b = Integer.parseInt(br.readLine());
                System.out.println(arr[a][b]);
            }


        }
    }




