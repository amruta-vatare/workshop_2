import java.util.Random;

public class DeckOfCards {
/*
Write a Program to initialise deck of cards
having suit ("Clubs", "Diamonds", "Hearts", "Spades") &
 Rank ("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace").
 Shuffle the cards using Random method and then distribute 9 Cards to 4 Players and
 Print the Cards the received by the 4 Players.*/

    private static  String [] Clubs ={"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    private static String [] Diamonds ={"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    private static String [] Hearts ={"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    private static String [] Spades ={"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    private static String [][] deck ={Clubs, Diamonds, Hearts, Spades};
    private String [][] newDeck;

    public void distributeCard(){
        newDeck = deck;
        for(int i = 1;i<5 ; i++){
            for(int j = 1;j<10;j++){
                getCard();
            }
        }
    }

    public void getCard(){
        Random r = new Random();
        int suit = r.nextInt(4);
        int rank = r.nextInt(13);
        if(newDeck[suit][rank] == null){
            getCard();
        }else{
            System.out.println(newDeck[suit][rank]+" ");
            newDeck[suit][rank] = null;
        }
    }

    public static void main(String[] args) {
        DeckOfCards play = new DeckOfCards();
        play.distributeCard();

    }
}
