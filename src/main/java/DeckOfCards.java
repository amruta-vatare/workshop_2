import java.util.Random;
import java.util.Scanner;

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
    private Player[] players ;

    public void distributeCard(int p){
        int players = p;
        newDeck = deck;
        for(int i = 1;i<=players ; i++){
            for(int j = 1;j<10;j++){
                getCard();
            }
            System.out.println();
        }
    }

    public void getCard(){
        Random r = new Random();
        int suit = r.nextInt(4);
        int rank = r.nextInt(13);
        if(newDeck[suit][rank] == null){
            getCard();
        }else{
            System.out.print(newDeck[suit][rank]+" ");
            newDeck[suit][rank] = null;
        }
    }
    //Use Case 2
    public void play(int n){
        players = new Player[n];
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<n;i++){
            System.out.println("Enter name for player");
            String name = sc.next();
            Player player = new Player(name);
            players[i] = player;
        }
        distributeCard(players.length);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many player");
        int n = sc.nextInt();
        if(n<2 || n>4){
            System.out.println("Unable to play, minimum 2 and maximum 4 player are required");
        }else{
            DeckOfCards play = new DeckOfCards();
            play.play(n);
        }
    }
}
