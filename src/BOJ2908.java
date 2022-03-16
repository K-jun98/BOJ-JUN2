import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        int reverse= Integer.parseInt(new StringBuffer(st.nextToken()).reverse().toString());
        int reverse2= Integer.parseInt(new StringBuffer(st.nextToken()).reverse().toString());

        if(reverse<reverse2)
            reverse=reverse2;
        System.out.println(reverse);

    }
}

//StringBuffer에 reverse()이용하여 뒤집기

