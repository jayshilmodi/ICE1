/*
Student ID: 991644621
 */
package cardtrickice1;

import java.util.Scanner;

/**
 * step1 : generate 7 random cards and store in array - how
 * step 2: take any card input from user suit,number
 * step 3: user card is in the array 'card is found'
 *
 * @author Jaysheel Modi
 */
public class CardTrickICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Card[] magicHand = new Card[7]; // Array of object
   
        for (int i = 0; i < magicHand.length; i++) {
            Card c1 = new Card();
            c1.setValue(Card.RandomValue());
            c1.setSuits(Card.RandomSuit());
            magicHand[i] = c1;
            System.out.println(magicHand[i].getValue() + " " + magicHand[i].getSuits());

        }

        System.out.println("Enter the card number (1 to 12)");
        int num = kb.nextInt();
        System.out.println("Choose the card suits: ");
        System.out.println("1:hearts\n2:diamonds\n3:spades\n4:clubs");
        int suitnum = kb.nextInt();
        String suit;
        suit = CallSuit(suitnum);

        boolean match = true;
        for (int i = 0; i < magicHand.length; i++) {
            match = true;
            if ((magicHand[i].getValue() == num) && (magicHand[i].getSuits().equals(suit))) {
                System.out.println("card is found");
                break;
            }

            else {
                match = false;
            }
        }

        if (match == false) {
            System.out.println("Card not found");
        }
    }

    public static String CallSuit(int a) {
        String suit = "";
        int b = a;
        switch (b) {
            case 1:
                suit = "hearts";
                break;

            case 2:
                suit = "diamonds";
                break;

            case 3:
                suit = "spades";
                break;

            case 4:
                suit = "clubs";
                break;

        }
        return suit;

    }
}
