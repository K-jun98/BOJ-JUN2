import java.io.*;
import java.math.BigInteger;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int value = Integer.parseInt(br.readLine());
        int cnt = 0;
        BigInteger big = new BigInteger("1");
        for (int i = value; i >= 2; i--) {
            big = big.multiply(BigInteger.valueOf(i));
        }
        String str = big.toString();
        for (int i = str.length()-1; i >= 0; i--) {
            if (str.charAt(i) == '0') {
                cnt++;
            } else {
                break;
            }
        }
        System.out.println(cnt);


    }
}