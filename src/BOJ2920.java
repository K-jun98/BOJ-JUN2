import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine().replace(" ","");
        if("12345678".equals(str))
            System.out.println("ascending");
        else if("87654321".equals(str))
            System.out.println("descending");
        else
            System.out.println("mixed");
        }

    }
