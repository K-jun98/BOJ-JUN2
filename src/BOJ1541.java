import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] minusarr = br.readLine().split("-");
        int min = 0;
        for (int i = 0; i < minusarr.length; i++) {
            String[] plusarr = minusarr[i].split("\\+");
            int temp = 0;
            for (int j = 0; j < plusarr.length; j++) {
                temp += Integer.parseInt(plusarr[j]);
            }
            if (i == 0) min = temp;
            else min -= temp;

        }
        System.out.println(min);

    }
}