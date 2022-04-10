import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


 class Main {

     public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int count = Integer.parseInt(br.readLine());
         for (int i = 0; i < count; i++) {
             String str = br.readLine();
             String regex = "^[A-F]?A+F+C+[A-F]?$";
             if (str.matches(regex)) {
                 System.out.println("Infected!");
             } else {
                 System.out.println("Good");
             }
         }
     }
 }