import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> ga = new ArrayList<Integer>();
        List<Integer> se = new ArrayList<Integer>();


        ga.add(Integer.parseInt(st.nextToken()));
        se.add(Integer.parseInt(st.nextToken()));

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int what = Integer.parseInt(st.nextToken());
            int where = Integer.parseInt(st.nextToken());
            if (what == 0) {
                int index;
                for (index = 0; where - se.get(index) > 0; index++) {
                    where -= se.get(index);
                }
                int temp = se.remove(index);
                se.add(index, temp - where);
                se.add(index, where);
            } else {
                int index;
                for (index = 0; where - ga.get(index) > 0; index++) {
                    where -= ga.get(index);
                }
                int temp = ga.remove(index);
                ga.add(index, temp - where);
                ga.add(index, where);
            }
        }
        int max = 0;
        for (int i : ga) {
            for (int j : se)
                max = Math.max(i * j, max);
        }
        System.out.println(max);


    }

}