import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
    ArrayList<String>[] arr= new ArrayList[n+3];
        for (int i = 0; i < n+3; i++) {
            arr[i]=new ArrayList<>();
        }
        arr[1].add("1");
        arr[2].add("2");
        arr[2].add("1+1");
        arr[3].add("3");
        arr[3].add("1+1+1");
        arr[3].add("1+2");
        arr[3].add("2+1");

        for (int i = 4; i <= n; i++) {
            for (int j = 1; j <= 3; j++) {
                for (String str : arr[i - j]) {
                    arr[i].add(str + "+" + j);
                }
            }
        }
            if(k>arr[n].size()){
                System.out.println(-1);
            }else{
                Collections.sort(arr[n]);
                System.out.println(arr[n].get(k-1));
            }

        }
    }
