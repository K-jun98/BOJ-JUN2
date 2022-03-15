
import java.util.Scanner;
import java.util.StringTokenizer;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();
        StringTokenizer st=new StringTokenizer(str);
        System.out.println(st.countTokens());

    }
}

//split으로 배열을 이용하면 아무것도 입력하지 않아도 1이나옴

