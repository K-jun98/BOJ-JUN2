import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[][] chars = new char[N][N];
        char[][] result = new char[N][N];
        for (int i = 0; i < N; i++) {
            chars[i] = br.readLine().toCharArray();
        }

        for (int i = 0; i < N; i++) {
            result[i] = br.readLine().toCharArray();
        }


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (result[i][j] == 'x') {
                    result[i][j] = (boomCount(chars,result, i, j));
                }
            }
        }

        if(!check(chars,result)){
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if(chars[i][j]=='*')
                        result[i][j]='*';
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                sb.append(result[i][j]);
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }



    public static char boomCount(char[][] chars,char[][] result,int x,int y){
        int cnt=0;
        for (int k = x-1; k < x+2; k++) {
            for (int l = y-1; l <y+2 ; l++) {
                if(k<0||l<0||k>=chars.length||l>=chars.length)
                    continue;
                if(chars[k][l]=='*')
                    cnt++;
                if(chars[x][y]=='*'&&result[x][y]=='x')
                    return '*';
            }
        }
        return (char) (cnt+'0');
    }
    public static boolean check(char[][] chars,char[][] result){
        for (int i = 0; i <chars.length; i++) {
            for (int j = 0; j <chars.length; j++) {
                if(chars[i][j]=='*'&&result[i][j]=='*'){
                    return false;
                }
            }
        }
        return true;
    }
}