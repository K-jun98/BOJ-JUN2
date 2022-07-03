import java.util.Scanner;

public class Main{
    static int N;
    static char[][] map;
    static char[][] visit;
    static char[][] result;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        map = new char[N][N];
        visit = new char[N][N];
        result = new char[N][N];
        sc.nextLine();
        for(int i = 0 ; i < N ; i++) {
            char[] arr = sc.nextLine().toCharArray();
            for(int j = 0 ; j < N ; j++) {
                map[i][j] = arr[j];
            }
        }

        for(int i = 0 ; i < N ; i++) {
            char[] arr = sc.nextLine().toCharArray();
            for(int j = 0 ; j < N ; j++) {
                visit[i][j] = arr[j];
            }
        }


        for(int i = 0 ; i < N ; i++) {
            for(int j = 0 ; j < N ; j++) {
                if(result[i][j] == '*') continue;
                if(visit[i][j] == 'x') {
                    if(map[i][j] == '*') {
                        sol2();
                        continue;
                    }
                    int a = sol(i,j);
                    result[i][j] = (char)(a+'0');

                }else {
                    result[i][j] = '.';
                }
            }
        }


        for(int i = 0 ; i < N ; i++) {
            for(int j = 0 ; j < N ; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }

    }
    public static void sol2() {
        for(int i = 0 ; i < N ; i++) {
            for(int j = 0 ; j < N ; j++) {
                if(map[i][j] == '*') {
                    result[i][j] = '*';
                }
            }
        }
    }
    public static int sol(int i,int j) {
        int count =0;
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1},{1,1},{-1,1},{1,-1},{-1,-1}};
        for(int[] dir : dirs) {
            int y= i+dir[0];
            int x = j+dir[1];
            if(y>=0 && y < N && x>=0 && x <N) {
                if(map[y][x] == '*') {
                    count++;
                }
            }
        }

        return count;
    }
}