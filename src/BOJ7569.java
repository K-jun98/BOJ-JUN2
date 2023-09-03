import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.StringTokenizer;

class Solution {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[][][] arr;
    static Queue<int[]> Q = new ArrayDeque<>();

    static int[] zArr = {1, -1, 0, 0, 0, 0};
    static int[] yArr = {0, 0, 1, -1, 0, 0};
    static int[] xArr = {0, 0, 0, 0, -1, 1};


    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int xSize = Integer.parseInt(st.nextToken());
        int ySize = Integer.parseInt(st.nextToken());
        int zSize = Integer.parseInt(st.nextToken());
        arr = new int[zSize][ySize][xSize];

        for (int j = 0; j < zSize; j++) {
            for (int i = 0; i < ySize; i++) {
                arr[j][i] = Arrays.stream(br.readLine().split(" "))
                        .mapToInt(Integer::valueOf)
                        .toArray();
            }
        }

        for (int z = 0; z < zSize; z++) {
            for (int y = 0; y < ySize; y++) {
                for (int x = 0; x < xSize; x++) {
                    if (arr[z][y][x] == 1) {
                        Q.offer(new int[]{z, y, x});
                        arr[z][y][x] = 2;
                    }
                }
            }
        }

        while (!Q.isEmpty()) {
            int[] ints = Q.poll();
            int z = ints[0];
            int y = ints[1];
            int x = ints[2];

            for (int i = 0; i < 6; i++) {
                int dz = z + zArr[i];
                int dy = y + yArr[i];
                int dx = x + xArr[i];

                if (dy >= 0 && dy < ySize && dx >= 0 && dx < xSize && dz >= 0 && dz < zSize && arr[dz][dy][dx] == 0) {
                    Q.offer(new int[]{dz, dy, dx});
                    arr[dz][dy][dx] = arr[z][y][x] + 1;
                }
            }
        }
        int day = 0;


        for (int z = 0; z < zSize; z++) {
            for (int y = 0; y < ySize; y++) {
                for (int x = 0; x < xSize; x++) {
                    if (arr[z][y][x] == 0) {
                        day = -1;
                    }
                    if (arr[z][y][x] != -1 && day != -1) {
                        day = Math.max(arr[z][y][x], day);
                    }
                }
            }
        }
        System.out.println(day == -1 ? -1 : day - 2);
    }

}
