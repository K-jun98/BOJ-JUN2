import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String str2 = br.readLine();
        str = str.replaceAll("[0-9]", "");
        if (str.contains(str2))
            System.out.println("1");
        else
            System.out.println("0");


    }
}