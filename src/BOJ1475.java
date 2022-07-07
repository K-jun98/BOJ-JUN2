import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int value = Integer.parseInt(br.readLine());
        int[] ints = new int[10];
        while(value!=0){
            ints[value%10]++;
        value/=10;
        }
        System.out.println(sets(ints));

    }
    public static int sets(int[] ints){
        int cnt=0;
        for (int i = 0; i <10; i++) {
            if (i == 6 || i == 9) {
                cnt = (int) Math.max(Math.round((ints[6]+ints[9]) / 2.0), cnt);
            } else {
                cnt = Math.max(ints[i], cnt);
            }
        }
        return cnt;
    }

}