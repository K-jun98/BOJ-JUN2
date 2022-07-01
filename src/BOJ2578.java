import java.util.Scanner;

 class Main {

    static int[][] map = new int[5][5];
    static int answer = 0;
    static int bingo = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 25; i++) {
            int number = sc.nextInt();
            answer++;
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    if (map[j][k] == number) {
                        map[j][k] = -1;

                        if (check(j, k) >= 3) {
                            System.out.println(answer);
                            return;
                        }
                    }
                }
            }
        }

    }

    private static int check(int r, int c) {
        int cnt = 0;
        for (int i = 0; i < 5; i++) {
            int rcnt = 0;
            for (int j = 0; j < 5; j++) {
                if (map[i][j] == -1)
                    rcnt++;
            }
            if (rcnt == 5)
                cnt++;
        }
        for (int i = 0; i < 5; i++) {
            int ccnt = 0;
            for (int j = 0; j < 5; j++) {
                if (map[j][i] == -1)
                    ccnt++;
            }
            if (ccnt == 5)
                cnt++;
        }
        int ccnt = 0;
        for (int i = 4; i >= 0; i--) {

            if (map[4-i][i] == -1)
                ccnt++;
            if (ccnt == 5)
                cnt++;
        }
        ccnt= 0;
        for ( int i=0; i<5; i++) {
            if ( map[i][i] == -1 ) ccnt++;
            if (ccnt == 5) cnt ++;
        }
        return cnt;
    }
}