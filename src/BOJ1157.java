
import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase();
        int[] set = new int[26];
        int max = 0;
        char ch = '?';
        for (int i = 0; i < str.length(); i++) {
            set[str.charAt(i) - 'A']++;
        }

        for (int j = 0; j < set.length; j++) {
            if (max < set[j]) {
                max = set[j];
                ch = (char) (j + 'A');
            } else if (max == set[j]) {
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}

