import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(palindrome(str));
    }




    public static int palindrome(String str){
        String str1 = new StringBuffer(str).reverse().toString();

        if(str1.equals(str)){
            return 1;
        }else{
            return 0;
        }
    }
}
