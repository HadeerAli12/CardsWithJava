public class Main {
    public static void main(String[] args) {
        AllCards allCards = new AllCards();
        for (int suit = SingleCard.DIAMONDS; suit <= SingleCard.SPADES; suit++) {
            for (int rank = SingleCard.ACE; rank <= SingleCard.KING; rank++) {
                SingleCard singleCard = allCards.getCard(suit, rank);
                System.out.println( singleCard.rankToString(singleCard.getRank())+" of "+
                        singleCard.suitToString(singleCard.getSuit()));
            }
        }
    }
}
