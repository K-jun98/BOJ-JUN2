import java.io.*;


class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        int[] ints = new int[number+2];
        ints[1]=1;
        ints[2]=2;
        for (int i = 3; i <=number; i++) {
            ints[i]=(ints[i-1]+ints[i-2])%10007;
        }
        System.out.println(ints[number]);
    }
}