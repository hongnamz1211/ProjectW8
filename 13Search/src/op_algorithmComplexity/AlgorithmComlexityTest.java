package op_algorithmComplexity;

import java.util.Scanner;

public class AlgorithmComlexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String inputString = scanner.nextLine();

        int[] frequentChar = new int[255];                      //{1}
        for (int i = 0; i < inputString.length(); i++) {        //{2}
            int ascii = inputString.charAt(i);                  //{3}
            frequentChar[ascii] += 1;                           //{4}
        }

        int max = 0;
        char character = (char) 255;                //{5}
        for (int i = 0; i < 255; i++) {             //{6}
            if (frequentChar[i] > max) {            //{7}
                max = frequentChar[i];              //{8}
                character = (char) i;               //{9}
            }
        }
        System.out.println("The most appearing letter is '" + character + "' with a frequency of " + max + " times");   //{10}
    }
}
