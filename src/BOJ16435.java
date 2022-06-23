import java.util.Arrays;
import java.util.Scanner;
 class Main {

   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int appleNum = sc.nextInt();
        int birdLength = sc.nextInt();
        int hi[] = new int[appleNum];

        for(int i = 0; i < appleNum; i++) {
            hi[i] = sc.nextInt();
        }
        Arrays.sort(hi);

        for(int i = 0; i < appleNum; i++) {
            if(hi[i] <= birdLength) birdLength++;
        }

        System.out.println(birdLength);


    }

}

