import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while(tc-- > 0) {
            int n = sc.nextInt();
            int cnt = 0;

            System.out.print("Pairs for " + n + ": ");
            for(int i = 1; i < n; i++) {
                for(int j = 1; j < n; j++) {
                    if(i + j == n && i < j) {
                        if(cnt == 0) {
                            cnt++;
                            System.out.print(i + " " + j);
                        } else {
                            System.out.print(", " + i + " " + j);
                        }
                    }
                }
            }

            System.out.println();
        }
    }
}