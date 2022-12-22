package coe318.lab5;

public class Card implements Comparable {
  //Symbolic constants

  public static final int CLUB = 0;
  public static final int DIAMOND = 1;
  public static final int HEART = 2;
  public static final int SPADE = 3;
int suit, rank; 
boolean faceUp;
  /**
   * Construct a card of the given rank, suit and whether it is faceup or
   * facedown. The rank is an integer from 2 to 14. Numbered cards (2 to 10)
   * have a rank equal to their number. Jack, Queen, King and Ace have the ranks
   * 11, 12, 13, and 14 respectively. The suit is an integer from 0 to 3 for
   * Clubs, Diamonds, Hearts and Spades respectively.
   *
   * @param rank
   * @param suit
   * @param faceUp
   */
  public Card(int rank, int suit, boolean faceUp) {
    this.rank = rank; 
    this.suit= suit; 
    this.faceUp = faceUp; 
    //FIX THIS
  }

  /**
   * @return the faceUp
   */
  public boolean isFaceUp() {
    return faceUp; //FIX THIS
  }

  /**
   * @param faceUp the faceUp to set
   */
  public void setFaceUp(boolean faceUp) {
    this.faceUp = faceUp; 
    //FIX THIS
  }

  /**
   * @return the rank
   */
  public int getRank() {
    return this.rank; //FIX THIS
  }

  /**
   * @return the suit
   */
  public int getSuit() {
    return suit;//FIX THIS
  }

  @Override
  public boolean equals(Object ob) {
    boolean canEqual = false; 
    if (!(ob instanceof Card)) {
      return false;
    }
    Card c = (Card) ob;
    if (c.suit== this.suit && this.rank == c.rank) { 
      canEqual = true; 
    } //FIX THIS
    return canEqual; 
  }

  @Override
  public int hashCode() {//DO NOT MODIFY
    int hash = 7;
    hash = 31 * hash + this.getRank();
    hash = 31 * hash + this.getSuit();
    return hash;
  }

  @Override
  public int compareTo(Object obj) {//DO NOT MODIFY
    return compareTo((Card) obj);
  }
// we want to return a negative, positive or zero depending on "this" is less than or equal to or greater than the other card 
// for positive this means "this" is >= c 
// for negative this means "this" is<= c 
// for zero this means "this" is == 0 
// check for if ranks are same, else check for suits which are ordered from 0-3 from clubs->Diamonds-> Hearts-> Spades
// for suits, set up attempt one case statement 
// 
  public int compareTo(Card c) { 
    int freturn = -1;
   if(this.rank>c.rank && !this.equals(c)){
      return 1;
   }
  if(this.rank==c.rank && this.suit>c.suit){
      return 1; 
        }
      
    else if(this.equals(c)){
      return 0; 

    }
    else {
      freturn =-1;
    }
    return freturn;
  }
  public int callcard(){
    int rankz = 0; 
        if(this.getRank()==14){
          return 1;
        } else if(this.getRank() > 10){
              return 10;
        }
        else{ 
          rankz= this.getRank(); 
        }
        
      return rankz; 
      }
  

  

  /**
   * Return the rank as a String. For example, the 3 of Hearts produces the
   * String "3". The King of Diamonds produces the String "King".
   *
   * @return the rank String
   */
  public String getRankString() {
    //FIX THIS
    switch(this.rank){
     case 11: 
    return( "The Card is Jack");
    case 12: 
    return("The Card is Queen");
    case 13: 
    return("The Card is King");
    case 14: 
    return("The Card is Ace");
    
    }
    return ("|" +rank+ "|");
  }

  /**
   * Return the suit as a String: "Clubs", "Diamonds", "Hearts" or "Spades".
   *
   * @return the suit String
   */
  public String getSuitString() {
   switch(this.suit){ 
    case 0: 
    return("\n"+"The current Suit is: CLUB");
    case 1:
    return("\n"+"The current Suit is: DIAMOND");
    case 2:
    return("\n"+"The current Suit is: HEART");
    case 3:
    return("\n"+"The current Suit is: SPADE");
   } //FIX THIS
   return ("\n"+"|"+ this.suit +"|");
  }

  /**
   * Return "?" if the card is facedown; otherwise, the rank and suit of the
   * card.
   *
   * @return the String representation
   */
  @Override
  public String toString() {

    if(this.faceUp){
      return(this.getRankString() +"\n"+"-->"+ this.getSuitString());
     
    } //FIX THIS
    else{
      return("?");
    }
  }

  public static void main(String[] args) {
    //Create 5 of clubs
    Card club5 = new Card(5, 0, true);
    System.out.println("club5: " + club5);
    Card spadeAce = new Card(14, SPADE, true);
    System.out.println("spadeAce: " + spadeAce);
    System.out.println("club5 compareTo spadeAce: "
            + club5.compareTo(spadeAce));
    System.out.println("club5 compareTo club5: "
            + club5.compareTo(club5));
    System.out.println("club5 equals spadeAce: "
            + club5.equals(spadeAce));
    System.out.println("club5 equals club5: "
            + club5.equals(club5));
  }
}
