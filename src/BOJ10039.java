import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int sum=0;
        for(int i=0; i<5;i++){
            int value=Integer.parseInt(br.readLine());
            if(value>=40){
                sum+=value;
            }else{
                sum+=40;
            }
        }
        System.out.println(sum/5);
    }
}

