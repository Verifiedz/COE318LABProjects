/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab5;

/**
 *
 * @author Saad Wasim
 */
import java.util.ArrayList;
import java.util.Random;// had to import for randomize method to work essentially the the random method 

/**
 * A pile of cards.
 *
 */
public class CardPile {
    //Instance variables
    // Forces the array list to accept only an array of Card type
    ArrayList<Card> cards = new ArrayList<Card>(); 
    public CardPile() {
        //Initialize the instance variable.
      
    }
    /**
     * Add a card to the pile.
     * @param card
     */
    public void add(Card card) { // In this method we want to return the Card a Card into the Array as a new Card being added to the Pile
        //FIX THIS
        cards.add(card); 

    }

    /**
     * Remove a card chosen at random from the pile.
     * @return
     */
    public Card removeRandom() {
       Random random = new Random(); 
       Card randomize = cards.get(random.nextInt(cards.size()));
       return randomize;
        //FIX THIS
    }

    /**
     * The string representation is a space separated list
     * of each card.
     * @return
     */
    @Override
    public String toString() {
        //FIX THIS
        String ListofCards="\n" + "List of Cards:";
        for(Card card : cards){
            ListofCards = ListofCards + card.toString(); 
        } return ListofCards; 
    }
    
    /**
     * @return the cards
     */
    public ArrayList<Card> getCards() {
        return cards;
    }

    public static void main(String[] args) {
        CardPile p = new CardPile();
        p.add(new Card(2, 1, true));
        p.add(new Card(3, 2, true));
        p.add(new Card(4, 3, false));
        p.add(new Card(14, 1, true));
        System.out.println("Removed: " + p.removeRandom());
        System.out.println("Removed: " + p.removeRandom());
        System.out.println("Removed: " + p.removeRandom());
        System.out.println("Removed: " + p.removeRandom());
        System.out.println("");
        CardPile deck = new CardPile();
        for(int i = 2; i < 15; i++) {
            for(int j = 0; j < 4; j++) {
                deck.add(new Card(i, j, true));
            }
        }
        for (int i = 0; i < 52; i++) {
            System.out.println((i+1) + ": " + deck.removeRandom());

        }
    }


}