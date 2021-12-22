package op_recursivealgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RecursiveAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String string = scanner.nextLine();
        Character character = 'b';
        ArrayList<Character> strings = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            strings.add(string.charAt(i));
        }
        Collections.sort(strings);
        System.out.println(strings);
        if (searchBinary(strings,0,strings.size() - 1, character) != -1) {
            System.out.println("String has value '" + character + "'!");
        } else {
            System.out.println("String has not value '" + character + "'!");
        }
    }

    public static int searchBinary(ArrayList<Character> strings, int low, int high, Character value) {
        int mid = (low + high) / 2;
        if (high >= low) {
            if (strings.get(mid) == value) {
                return mid;
            } else if (strings.get(mid) > value) {
                return searchBinary(strings, low, mid - 1, value);
            } else if (strings.get(mid) < value) {
                return searchBinary(strings, mid + 1, high, value);
            }
        }
        return -1;
    }
}
