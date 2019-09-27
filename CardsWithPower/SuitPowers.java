package CardsWithPower;

public enum SuitPowers {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private int powerOfSuit;

    SuitPowers(int powerOfSuit) {
        this.powerOfSuit = powerOfSuit;
    }

    public int getPowerOfSuit() {
        return powerOfSuit;
    }
}
