import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SIZE = 8;
        char[][] chessBoard = new char[SIZE][SIZE];
        int num = 0;

        String str;
        for (int i = 0; i < SIZE; i++) {
            str = scanner.nextLine();
            for (int j = 0; j < SIZE; j++) {
                chessBoard[i][j] = str.charAt(j);

                if ((i + j) % 2 == 0 && chessBoard[i][j] == 'F') {
                    num++;
                }
            }
        }

        System.out.println(num);
    }
}
