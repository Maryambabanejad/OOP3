package Packege2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NewRepetition {
    private final static Scanner SCANNER = new Scanner(System.in);
    private static final List<Container> NUMBERS = new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int input = SCANNER.nextInt();
            if (isExist(NUMBERS, input)) {
                Container container = getExistContainer(NUMBERS, input);
                int index = getIndex(NUMBERS, input);
                NUMBERS.get(index).setValue(container.getValue() + 1);
            } else {
                NUMBERS.add(new Container(input, 1));
            }
        }

        for (Container number : NUMBERS) {
            System.out.println(number.getKey() + " -> " + number.getValue());
        }
    }

    private static boolean isExist(List<Container> numbers, int key) {
        for (Container number : numbers) {
            if (number.getKey() == key) return true;
        }
        return false;
    }

    private static Container getExistContainer(List<Container> numbers, int key) {
        for (Container number : numbers) {
            if (number.getKey() == key) return number;
        }
        return null;
    }

    private static int getIndex(List<Container> numbers, int key) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i).getKey() == key) return i;
        }
        return -1;
    }
}

class Container {
    private int key;
    private int value;

    public Container() {
    }

    public Container(int key, int value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
