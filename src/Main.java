public class Main {


    public static void main(String[] args) {
        // Variabler af typen Rank
        Rank highCard, faceCard, card1, card2;

        // Giver variablerne værdier
        highCard = Rank.ACE;
        faceCard = Rank.KING;
        card1 = Rank.FIVE;
        card2 = Rank.TEN;

        // Printer en linje hvor highCard og faceCard bliver brugt
        System.out.println("A blackjack hand: " + highCard + " and " + faceCard);

        // Variabler af typen int
        int card1Val, card2Val, result;
        card1Val = 5;
        card2Val = 10;
        result = card1Val + card2Val;

        // Printer 2 linjer med hånden og summen af de 2 kort
        System.out.println("A two card hand: " + card1 + " and " + card2);
        System.out.println("Hand value: " + result );


    }
}
