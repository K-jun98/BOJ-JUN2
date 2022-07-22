import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int out = 0,in = 0;
        int total = 0,max_total = 0;
        for(int i=0;i<4;i++) {
            out = scan.nextInt();
            in = scan.nextInt();
            total = total-out+in;
            max_total = max(max_total,total);
        }
        System.out.println(max_total);
    }

    private static int max(int total, int i) {
        if(total>=i)
            return total;
        else
            return i;
    }

}