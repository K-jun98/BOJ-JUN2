import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> prices = new ArrayList<>();
        int cash = Integer.parseInt(br.readLine());
        for (String price : br.readLine().split(" ")) {
            prices.add(Integer.valueOf(price));
        }
        int bnp = bnp(prices, cash);
        int timing = timing(prices, cash);
        if (bnp > timing) {
            System.out.println("BNP");
        } else if (bnp < timing) {
            System.out.println("TIMING");
        } else {
            System.out.println("SAMESAME");
        }


    }

    public static int bnp(List<Integer> prices, int cash) {
        int cnt = 0;
        for (int i = 0; i < prices.size(); i++) {
            if (cash / prices.get(i) > 0) ;
            cnt += cash / prices.get(i);
            cash %= prices.get(i);
        }
        return (cnt * (prices.get(prices.size() - 1))) + cash;
    }

    public static int timing(List<Integer> prices, int cash) {
        int cnt = 0;
        for (int i = 3; i < prices.size(); i++) {
            if (prices.get(i) > prices.get(i - 1) && prices.get(i - 1) > prices.get(i - 2) && prices.get(i - 2) > prices.get(i - 3) && cnt > 0) {
                cash = cash + cnt * prices.get(i);
                cnt = 0;
            } else if (prices.get(i) < prices.get(i - 1) && prices.get(i - 1) < prices.get(i - 2) && prices.get(i - 2) < prices.get(i - 3))
                if (cash / prices.get(i) > 0) {
                    cnt = cnt + cash / prices.get(i);
                    cash %= prices.get(i);
                }
        }
        return (cnt * (prices.get(prices.size() - 1))) + cash;
    }
}

