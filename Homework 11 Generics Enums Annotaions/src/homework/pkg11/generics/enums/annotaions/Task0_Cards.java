package homework.pkg11.generics.enums.annotaions;

import java.util.Arrays;

public class Task0_Cards {

    public static void main(String[] args) {

        CardRank[] ranks = CardRank.values();
        for (CardRank rank : ranks) {
            System.out.print(rank + " ");
        }
        System.out.println();

        CardSuit[] suits = CardSuit.values();
        for (CardSuit suit : suits) {
            System.out.print(suit + " ");
        }

        System.out.println();

        System.out.println(Arrays.toString(CardSuit.values()));
        System.out.println(Arrays.toString(CardRank.values()));

        int n = ranks.length;
        for (int i = 0; i < n - 1; i++) {
            System.out.print(ranks[i] + ", ");
        }
        System.out.println(ranks[n - 1]);

        int m = suits.length;
        for (int j = 0; j < m - 1; j++) {
            System.out.print(suits[j] + ", ");
        }
        System.out.println(suits[m - 1]);
    }
}
