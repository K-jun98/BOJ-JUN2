import java.io.*;

class Main {
      public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          int N = Integer.parseInt(br.readLine());
          StringBuilder sb=new StringBuilder();
          int[] arr = new int[10001];
          for (int i = 0; i < N; i++) {
              arr[Integer.parseInt(br.readLine())]++;
          }
          for (int i = 0; i < 10001; i++) {
              while (arr[i]!=0){
                  sb.append(i).append("\n");
                  arr[i]--;
          }
      }
          System.out.println(sb);
  }
  }