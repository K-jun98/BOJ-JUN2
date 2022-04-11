import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int count = Integer.parseInt(br.readLine());
        String[] arr = new String[count];
        for (int i = 0; i < count; i++) {
            arr[i] = br.readLine();
        }

        for (int i = 0; i < arr[0].length(); i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[0].charAt(i) != arr[j].charAt(i)) {
                    sb.append("?");
                    break;
                } else if (j == arr.length - 1) {
                    sb.append(arr[j].charAt(i));
                }
            }
        }
        System.out.println(sb);
    }
}