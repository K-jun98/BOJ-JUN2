import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

  class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();	// N 은 쓸모가 없으므로 입력만 받는다.

        int sum = 0;
        String str=br.readLine();
        for(byte value : str.getBytes(StandardCharsets.UTF_8)) {
            sum += (value - '0');	// 또는 (a-48)
        }

        System.out.print(sum);

    }
}