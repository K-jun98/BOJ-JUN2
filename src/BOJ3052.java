import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;


public class BOJ3052 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      Set<Integer> set = new HashSet();

for(int i=0;i<10;i++){
    int val=Integer.parseInt(br.readLine())%42;
    set.add(val);
        }
        System.out.println(set.size());
    }
}