import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        while (true) {
            boolean check = true;
            String str = br.readLine();
            if ("end".equals(str))
                break;
            if (!isVowel(str)) {
                check = false;
            }

            if(str.length()>2) {
                for (int i = 2; i < str.length(); i++) {
                    if (notVowel(str.charAt(i - 2)) && notVowel(str.charAt(i - 1)) && notVowel(str.charAt(i))) {
                        check = false;
                    } else if (!notVowel(str.charAt(i - 2)) && !notVowel(str.charAt(i - 1)) && !notVowel(str.charAt(i))) {
                        check = false;
                    }
                }
            }
            if(str.length()>1){
                for (int i = 1; i < str.length(); i++) {
                    if (str.charAt(i) != 'e' && str.charAt(i) != 'o') {
                        if (str.charAt(i) == str.charAt(i - 1)) {
                            check = false;
                        }
                    }
                }
            }
            if (!check) {
                System.out.println("<" + str + "> is not acceptable.");
            } else {
                System.out.println("<" + str + "> is acceptable.");
            }
        }
    }


    static boolean isVowel(String str) {
        return str.contains("a") || str.contains("e") || str.contains("i") || str.contains("o") || str.contains("u");

    }

    static boolean notVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}