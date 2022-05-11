import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[] arr = new int[N];
        int[] sortarr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(st.nextToken());
            arr[i] = temp;
            sortarr[i] = temp;
        }
        Arrays.sort(sortarr);
        HashMap<Integer,Integer> map = new HashMap<>();
        int idx=0;
        for(int i=0;i<N; i++){
            if(!map.containsKey(sortarr[i])){
                map.put(sortarr[i],idx++);
            }
        }
        for(int i : arr){
            sb.append(map.get(i)).append(" ");
        }
        System.out.println(sb);
        }
    }
