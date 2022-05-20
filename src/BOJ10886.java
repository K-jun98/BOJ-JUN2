import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int c=0, nc=0;
        for(int i=0; i<N; i++) {
            if(sc.nextInt()==1) c++;
            else nc++;
        }
        if(c>nc) System.out.println("Junhee is cute!");
        else System.out.println("Junhee is not cute!");
    }
}