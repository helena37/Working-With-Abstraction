package CardsWithPower;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        String rank = reader.readLine();
        String suit = reader.readLine();

        RankPowers[] ranks = RankPowers.values();
        SuitPowers[] suits = SuitPowers.values();

        System.out.print(String.format("Card name: %s of %s; ",
                rank, suit));

        for (RankPowers rankPowers : ranks) {
            for (SuitPowers suitPowers : suits) {
                if (rank.equals(rankPowers.name()) &&
                suit.equals(suitPowers.name())) {
                    System.out.println(String.format("Card power: %d",
                            rankPowers.getPower() + suitPowers.getPowerOfSuit()));
                    return;
                }
            }
        }
    }
}
