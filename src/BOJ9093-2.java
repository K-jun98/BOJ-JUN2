import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    int N=Integer.parseInt(br.readLine());
        for (int j = 0; j < N; j++) {
            String[] str =br.readLine().split(" ");
            reverse(str);
            for (int i = 0; i <str.length ; i++) {
                System.out.print(str[i]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
    public static void reverse(String[] str){
        for (int i = 0; i < str.length; i++) {
            StringBuilder sb=new StringBuilder();
            str[i]= String.valueOf(sb.append(str[i]).reverse());

        }
    }
}