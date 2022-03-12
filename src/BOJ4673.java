class BOJ467 {

    public static void main(String[] args) {
        int[] arr = new int[10001];

        for (int i = 1; i <= 10000; i++) {
            if (arr[i] == 0)
                System.out.println(i);

            if (d(i) <= 10000)
                arr[d(i)]++;
        }
    }

    static int d(int n) {
        int b = n;
        while (n != 0) {

            b += n % 10;
            n = n / 10;
        }
        return b;
    }
}