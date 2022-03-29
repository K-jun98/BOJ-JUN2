import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr=br.readLine().split(" ");
        int N = Integer.parseInt(arr[0]);
        int M = Integer.parseInt(arr[1]);


        Set set = new HashSet();
    for(int i=0;i<N;i++){
        set.add(br.readLine());
    }
        ArrayList list = new ArrayList();
    for(int j=0;j<M;j++){
        String str=br.readLine();
        if(set.contains(str)){
            list.add(str);
        }

    }
        Collections.sort(list);
        System.out.println(list.size());
    for(int k=0;k<list.size();k++){
        System.out.println((String) list.get(k));
    }

    }
}