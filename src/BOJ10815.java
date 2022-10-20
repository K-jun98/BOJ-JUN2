import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < num; i++) {
            int temp = scanner.nextInt();
            set.add(temp);
        }
        num = scanner.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            int temp = scanner.nextInt();
            if (set.contains(temp)) {
                arr[i] = 1;
            }
        }
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}