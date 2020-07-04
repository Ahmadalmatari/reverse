package tasks;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the word :");
        String word = scanner.next();
        System.out.println("the reverse word is :");
        reverse(word);

    }

    public static void reverse(String word) {

        char[] theCharWord = word.toCharArray();
        char letter1, letter2;
        int i = 0;
        {
            for (int j = word.length() - 1; j > 0; j--) {
                if (i >= j)
                    break;
                else {
                    letter1 = theCharWord[i];
                    letter2 = theCharWord[j];
                    theCharWord[j] = letter1;
                    letter1 = letter2;
                    theCharWord[i] = letter1;
                    i++;
                }
            }

            System.out.println(theCharWord);

        }
    }
}
