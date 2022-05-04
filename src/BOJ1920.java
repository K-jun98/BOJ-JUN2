import java.io.*;
import java.util.*;

 class Main {
     public static void main(String[] args) throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     TreeSet<Integer> set=new TreeSet<>();
     int N=Integer.parseInt(br.readLine());
     StringTokenizer st= new StringTokenizer(br.readLine());
     for(int i=0;i<N;i++) {
     set.add(Integer.valueOf(st.nextToken()));
     }
         int M=Integer.parseInt(br.readLine());
         int[] arr1 = new int[M];
         st= new StringTokenizer(br.readLine());
         for(int i=0;i<M;i++) {
             arr1[i]=Integer.parseInt(st.nextToken());
         }

         for(int i=0;i<M;i++){
             if(set.contains(arr1[i]))
                 System.out.println(1);
             else
                 System.out.println(0);


        }
    }
}