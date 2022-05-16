import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack();
        String str = br.readLine();
        boolean check = false;
        for (int i = 0; i < str.length(); i++) {
           if(str.charAt(i)=='<'){
               while(!stack.empty()){
                   sb.append(stack.pop());
               }
               check=true;
               sb.append(str.charAt(i));
           }else if(str.charAt(i)=='>'){
               check=false;
               sb.append('>');
           }else if(str.charAt(i)==' '&&check==true){

                   sb.append(str.charAt(i));
           }else if(str.charAt(i)==' '&&check==false){
               while(!stack.empty()){
                   sb.append(stack.pop());
               }
               sb.append(str.charAt(i));
               }else if(str.charAt(i)>='a'&&'z'>=str.charAt(i)||str.charAt(i)>='0'&&'9'>=str.charAt(i)){
               if(check){
                   sb.append(str.charAt(i));
               }else{
                   stack.push(str.charAt(i));
               }
           }
           }
        while(!stack.empty()){
            sb.append(stack.pop());
        }
        System.out.println(sb);
        }

    }



