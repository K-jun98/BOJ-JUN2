import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String[] strarr=new String[count];
        StringBuffer sb = null;
        for (int i = 0; i < count; i++) {
            sb = new StringBuffer();
            String[] arr = br.readLine().split(" ");
            for (int j = 0; j < arr.length; j++) {
                    arr[j]=sb.append(arr[j]).reverse().append(" ").toString();
                    sb.delete(0,arr[i].length());
            }
            for(int k =0;k<arr.length;k++){
                System.out.printf(arr[k]);
            }
        }
    }
}