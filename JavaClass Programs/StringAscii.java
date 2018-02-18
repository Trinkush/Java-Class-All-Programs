package string.ascii;

import java.util.Scanner;

public class StringAscii {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String enteredText = input.nextLine();

        for (int i = 0; i < enteredText.length(); i++) {
            char charName = enteredText.charAt(i);
            int charAscii = ((int) charName);
            System.out.println("Character: " + charName + " and Ascii: " + charAscii);
        }

    }
}
