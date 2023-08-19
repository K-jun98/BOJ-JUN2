import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static boolean[][] arr;

    static boolean[] arr2;

    public static void main(String[] args) throws IOException {
        int computer = Integer.parseInt(br.readLine());
        int line = Integer.parseInt(br.readLine());
        arr = new boolean[computer + 1][computer + 1];
        arr2 = new boolean[computer + 1];

        for (int i = 0; i < line; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int y = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            arr[y][x] = true;
            arr[x][y] = true;
        }
        dfs(1);
        int count = 0;
        for (int i = 0; i <arr2.length ; i++) {
            if (arr2[i] == true) {
                count++;
            }
        }
        System.out.println(count-1);
    }

    public static void dfs(int y) {
        arr2[y] = true;
        for (int i = 1; i < arr[y].length; i++) {
            if (arr[y][i] == true && !arr2[i]) {
                dfs(i);
            }
        }
    }
}
