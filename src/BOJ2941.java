import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//백준 2941
class Main {
    public static void main(String[] args) throws IOException {
        String[] strArr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();


        for (int i = 0; i < strArr.length; i++) {
            str=str.replace(strArr[i],"*");

        }
        System.out.println(str.length());


    }
}