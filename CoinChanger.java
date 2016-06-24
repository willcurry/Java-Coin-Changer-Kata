import java.util.ArrayList;
import java.util.List;

public class CoinChanger {
    public String change(int money) {

        List<String> result = new ArrayList<>();

        int[] coins = {50, 20, 10, 5, 2, 1};

        for (int i = 0; i < coins.length; i++) {
            while (money >= coins[i]) {
                money -= coins[i];
                result.add(String.valueOf(coins[i]));
            }
        }

        return format(result);
    }

    public String format(List result) {

        String formattedChange = "";

        if (!result.isEmpty()) {
            formattedChange += result.get(0);
        }

        for (int i=1; i < result.size(); i++) {
            formattedChange += ", ";
            formattedChange += result.get(i);
        }

        return formattedChange;
    }
}