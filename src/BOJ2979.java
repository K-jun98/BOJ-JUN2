import java.util.Scanner;

public class Main{
    static int time[] = new int[101], a, b, c;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt(); b = sc.nextInt(); c = sc.nextInt();
        int i, s, e, max = 0, min = 101;
        for(i=0;i<3;i++){
            s = sc.nextInt(); e = sc.nextInt();
            calc(s, e);
            if (s < min) min = s;
            if (max < e) max = e;
        }
        System.out.println(fair(min, max));
        sc.close();
    }

    private static void calc(int s, int e) { for (int i = s; i < e; i++) time[i]++; }

    private static int fair(int min, int max){
        int res = 0;
        for (int i = min; i <= max; i++) {
            if (time[i] == 1) res += (time[i] * a);
            else if (time[i] == 2) res += (time[i] * b);
            else res += (time[i] * c);
        }
        return res;
    }
}