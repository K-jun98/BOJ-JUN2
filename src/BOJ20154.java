import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int sum = 0;
        int[] arr= {3,2,1,2,3,3,3,3,1,1,3,1,3,3,1,2,2,2,1,2,1,1,2,2,2,1};
        for(int i=0;i<str.length();i++) {
            sum += arr[(str.charAt(i) - 'A')];
        }
        if(sum%2==0)
        System.out.println("You're the winner?");
        else
            System.out.println("I'm a winner!");
    }
}