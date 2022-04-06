import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            String[] arr = str.split(" ");
            int x = 0;
            int cnt = 0;
            for (int i = 0; i < arr[0].length(); i++) {
                for (int j = x; j < arr[1].length(); j++) {
                    if (arr[0].charAt(i) == arr[1].charAt(j)) {
                        x = ++j;
                        cnt++;
                        break;
                    }
                }
            }
            System.out.println(cnt == arr[0].length() ? "Yes" : "No");
        }
    }
}