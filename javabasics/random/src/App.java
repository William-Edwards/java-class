import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Map<Integer, String[]> map = new HashMap<>();

        String[][] monthsAndStones = { { "Jan", "Garnet" }, { "feb", "amethyst" }, { "march", "aqua" } };

        // add key values to hashmap
        for (int i = 0; i < monthsAndStones.length; i++) {

            map.put(i, monthsAndStones[i]);
        }

        // scanner for user input
        Scanner sc = new Scanner(System.in);

        System.out.println("What month's birthstone do you want to know?");
        String numString = sc.nextLine();
        int num = Integer.parseInt(numString);

        String month = map.get(num - 1)[0];
        String stone = map.get(num - 1)[1];

        System.out.println(month + " birthstone is " + stone);

    }
}
