import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine());

        ArrayList<Float> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int width = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
            float ppi = (float) Math.sqrt(width * width + height * height) / 24;
            list.add(ppi);
        }

        ArrayList<Float> copyList = new ArrayList<>(list);
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();

        for (int i = list.size() - 1; i >= 0; i--) {
            float key = list.get(i);
            int index = copyList.indexOf(key);
            copyList.set(index, null);
            sb.append(index + 1 + "\n");
        }
        System.out.println(sb);
    }
}