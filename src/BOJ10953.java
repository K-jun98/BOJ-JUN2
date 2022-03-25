import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N=Integer.parseInt(sc.nextLine());
        String[] arr=new String[2];
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0;i<N;i++){
            arr = sc.nextLine().split(",");
            int a=Integer.parseInt(arr[0])+Integer.parseInt(arr[1]);
            bw.write(a+"\n");

        }
        bw.flush();
    }
}