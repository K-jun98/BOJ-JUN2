import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        ArrayList<weight> list = new ArrayList<weight>();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        Arrays.fill(arr,1);
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            list.add(new weight(w, h));
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (list.get(i).tall < list.get(j).tall && list.get(i).weight<list.get(j).weight){
                    arr[i]++;
                }
            }
        }
        for(int i:arr){
            System.out.print(i);
        System.out.print(" ");
    }
    }
}

class weight {
    int weight = 0;
    int tall = 0;

    weight(int weight, int tall) {
        this.weight = weight;
        this.tall = tall;
    }


}