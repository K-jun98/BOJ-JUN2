import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str= br.readLine();
        str=str.replaceAll("[CAMBRIDGE]","");

        System.out.println(str);
        }
    }



