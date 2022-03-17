import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 1316
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int val = 0;

        for (int i = 0; i < count; i++) {
            String str = br.readLine();
            if (check(str))
                val++;
        }
        System.out.println(val);
    }

    public static boolean check(String word) {
        boolean[] arr = new boolean[26];
        for (int i = 0; i < word.length(); i++) {
            if (arr[word.charAt(i) - 'a']) {
                return false;
            } else {
                if (i < word.length() - 1)
                    if (word.charAt(i) != word.charAt(i + 1))
                        arr[word.charAt(i)-'a'] = true;
            }
        }
        return true;
    }
}
