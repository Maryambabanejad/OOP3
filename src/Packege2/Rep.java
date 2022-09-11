package Packege2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Rep {
    private final static Scanner SCANNER = new Scanner(System.in);
    private final static Map<Integer, Integer> MAP = new HashMap<>();

    public static void main(String[] args) {
       /* for (int i = 0; i < 10; i++) {
            int input = SCANNER.nextInt();
//            if (input >= 10) throw new RuntimeException("Anghezi");
            if (MAP.containsKey(input)) {
                int value = MAP.get(input);
                MAP.put(input, value + 1);
            } else {
                MAP.put(input, 1);
            }
        }*/

        int counter = 0;
        while (counter < 10) {
            int input = SCANNER.nextInt();

            /*if (input >= 10) {
                System.out.println("\u001B[36m" + "Anghezi" + "\u001B[0m");
                continue;
            }
            else*/ counter++;

            if (MAP.containsKey(input)) {
                int value = MAP.get(input);
                MAP.put(input, value + 1);
            } else {
                MAP.put(input, 1);
            }
        }

        System.out.println(MAP);
    }
}
