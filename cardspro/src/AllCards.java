public class AllCards {
    public static int numOfSuits = 4;
    public static int numOfRanks = 13;
    public static int numOfCards = numOfRanks * numOfSuits;
    private SingleCard[][] singleCards;

    public AllCards() {
        singleCards = new SingleCard[numOfSuits][numOfRanks];
        for (int suit = SingleCard.DIAMONDS; suit <= SingleCard.SPADES; suit++) {
            for (int rank = SingleCard.ACE; rank <= SingleCard.KING; rank++) {
                singleCards[suit - 1][rank - 1] = new SingleCard(rank, suit);
            }
        }

    }
        public SingleCard getCard ( int suit, int rank){
            return singleCards[suit - 1][rank - 1];
        }

}

