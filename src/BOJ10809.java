import java.util.Arrays;
import java.util.Scanner;

class Main {
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          String str = sc.next();



          int[] ints=new int[26];
          Arrays.fill(ints,-1);

          for(int i=0;i<str.length();i++){
              char ch= str.charAt(i);
              if(ints[ch-'a']==-1)
                  ints[ch-'a']=i;
          }
          for(int ii : ints){
              System.out.printf(ii+" ");
          }
      }




  }
