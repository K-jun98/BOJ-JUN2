import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[][] arr;

    static int[] yArr = {1, 1, 0, -1, -1, -1, 0, 1};
    static int[] xArr = {0, -1, -1, -1, 0, 1, 1, 1};

    static Queue<int[]> Q = new ArrayDeque();

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int y = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        arr = new int[y][x];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::valueOf)
                    .toArray();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 1) {
                    Q.offer(new int[]{i, j});
                }
            }
        }
        bfs();
        int answer = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                answer = Math.max(answer, arr[i][j]);
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println(answer - 1);
    }

    public static void bfs() {

        while (!Q.isEmpty()) {
            int[] ints = Q.poll();
            int y = ints[0];
            int x = ints[1];
            for (int i = 0; i < 8; i++) {
                int ny = y + yArr[i];
                int nx = x + xArr[i];
                if (ny >= 0 && ny < arr.length && nx >= 0 && nx < arr[0].length && arr[ny][nx] == 0) {
                    Q.offer(new int[]{ny, nx});
                    arr[ny][nx] = arr[y][x] + 1;
                }
            }
        }
    }

}
