import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[][] arr;

    static int[] yArr = {1, -1, 0, 0};
    static int[] xArr = {0, 0, -1, 1};

    static Queue<int[]> Q = new ArrayDeque();
    static boolean[][] check;
    static int n;

    static int count;

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::valueOf)
                    .toArray();
        }
        int max = 0;
        for (int i = 0; i < 100; i++) {
            max = Math.max(solve(i), max);
        }
        System.out.println(max);

    }

    public static int solve(int h) {
        count = 0;
        check = new boolean[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] > h && check[i][j] == false) {
                    dfs(i, j, h);
                    count++;
                }
            }
        }
        return count;
    }

    public static void dfs(int y, int x, int h) {
        check[y][x] = true;
        for (int i = 0; i < 4; i++) {
            int dy = y + yArr[i];
            int dx = x + xArr[i];
            if (dy >= 0 && dy < n && dx >= 0 && dx < n && arr[dy][dx] > h && check[dy][dx] == false) {
                dfs(dy, dx, h);
            }
        }
    }

}
