package coe318.lab5;

import java.util.Scanner;

public class SimpleUI implements UserInterface {
    private BlackjackGame game;
    private Scanner user = new Scanner(System.in);

  @Override
    public void setGame(BlackjackGame game) {
        this.game = game;
    }
    /* Display the cards held by the House
    * and the player (you).
    */
  @Override
    public void display() {
    System.out.println("House Currently has"); //FIX THIS
    System.out.println(this.game.getHouseCards());            //"\n"
    System.out.println("You Currently have in your possession"); 
    System.out.println(this.game.getYourCards());            //"\n"
    }

  @Override
  // returns true if user wishes for a card else false 
   public boolean hitMe() { //FIX THIS
     
      System.out.println("Would you like a Card"); 
      String input = user.nextLine();
      boolean wantcard = true; 
      switch(input){
        case  "Yes", "yes", "y": 
          wantcard = true; 
          break; 
        case "No", "no", "n": 
          wantcard= false; 
          break; 
        default: 
          System.out.println("Incorrect input");
          hitMe();
      }
      return wantcard; 
    }


  @Override
    public void gameOver() {
      {
        this.display();
        int Hscore = game.score(game.getHouseCards());
        int Pscore = game.score(game.getYourCards());
        System.out.println("House Score: " + Hscore + ", Your Score: " + Pscore);
        if( (Pscore > Hscore || Hscore > 21) && (Pscore <= 21)){
            System.out.println("Player Has Won");
        }
        else{
            System.out.println("House Has Won");
        }
       System.out.println("Game is Over");

    }  //FIX THIS
    }
   
}