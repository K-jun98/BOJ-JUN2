import java.util.*;

public class Main {
    public static int[][] map;
    public static Set<Integer> set = new HashSet<>();
    public static int[] dx = {1,-1,0,0}; // 상 하 좌 우
    public static int[] dy = {0,0,-1,1};


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        map = new int[6][6];
        for(int i=1; i<=5; i++){
            for(int j=1 ; j<=5; j++){
                map[i][j] = sc.nextInt();
            }
        }


        for(int i=1; i<=5; i++){
            for(int j=1 ; j<=5; j++){
                dfs(i,j,0,0);
            }
        }

        System.out.println(set.size());

    }

    public static void dfs(int x, int y, int count, int sum){
        sum = (sum*10)+map[x][y];
        count +=1;
        if(count==6){
            set.add(sum);
            return;
        }
        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx<1 || nx>5 || ny<1 || ny>5){
                continue;
            }
            dfs(nx, ny, count, sum);
        }
    }
}