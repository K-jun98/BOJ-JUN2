import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String wait = br.readLine();
        String bomb = br.readLine();
        int hour = Integer.parseInt(bomb.split(":")[0])-Integer.parseInt(wait.split(":")[0]);
        int minute = Integer.parseInt(bomb.split(":")[1])-Integer.parseInt(wait.split(":")[1]);
        int second = Integer.parseInt(bomb.split(":")[2])-Integer.parseInt(wait.split(":")[2]);

        if (wait.equals(bomb)) {
            System.out.print("24:00:00");
        } else {
            if (second < 0) {
                second += 60;
                minute--;
            }
            if (minute < 0) {
                minute += 60;
                hour--;
            }
            if (hour < 0) {
                hour += 24;
            }
            System.out.printf("%02d:%02d:%02d",hour,minute,second);
        }


    }
}