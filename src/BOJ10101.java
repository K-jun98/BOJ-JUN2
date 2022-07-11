import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] ints = new int[3];
        for (int i = 0; i < 3; i++) {
            ints[i] = Integer.parseInt(br.readLine());
        }
        if (ints[0] == 60 && ints[1] == 60 && ints[2] == 60)
            System.out.println("Equilateral");
        else if (ints[0] + ints[1] + ints[2] == 180) {
            if (ints[0] == ints[1] || ints[0] == ints[2] || ints[1] == ints[2]) {
                System.out.println("Isosceles");
            } else if (ints[0] != ints[1] && ints[0] != ints[2] && ints[1] != ints[2])
                System.out.println("Scalene");
        } else {
            System.out.println("Error");
        }
    }
}