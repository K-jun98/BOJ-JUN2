import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            int num = sc.nextInt();
            int sum = 0;
            if(num == 0)
                break;
            for(int i=1;i<=num;i++)
            {
                sum += i*i;
            }
            System.out.println(sum);
        }
    }
}