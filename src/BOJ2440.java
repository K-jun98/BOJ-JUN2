import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
for(int j=0;j<N;j++) {
    for (int i = N; i > j; i--) {
        System.out.print("*");
    }
    System.out.println();
}

}
}