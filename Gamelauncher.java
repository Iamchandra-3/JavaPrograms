 class GuessGame{
    //GuessGame has 3 instance variables for the 3 player objects
    Player p1;
    Player p2;
    Player p3;

    public void startGame()
    {
    //Create 3 player objects and assign them to the 3 player instance variables
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
    //Declare 3 variables to hold the 3 guesses the players make
        int guessp1 = 0, guessp2 = 0, guessp3 = 0;
    //Declare 3 variables to hold a true or false based on player's answer
        boolean p1isRight = false, p2isRight = false, p3isRight = false;
    //make a 'target' number that the player have to guess
        int targetNumber = (int) (Math.random()*10);  
        System.out.println("I'm thinking of a number between 0 and 9...");

        while(true)
        {
            System.out.println("Number to guess is "+ targetNumber);
            //call each player's guess method
            p1.guess();
            p2.guess();
            p3.guess();
            //get each player's guess by accessing the number variable of each player
            guessp1 = p1.number;
            System.out.println("Player one guessed " + guessp1);
            guessp2 = p2.number;
            System.out.println("Player two guessed " + guessp2);
            guessp3 = p3.number;
            System.out.println("Player three guessed " + guessp3);
//check each player's guess to see if it matches the target number. if a player is right,
//then set that player's variable to be true (by default we set it as false)
            if (guessp1 == targetNumber){
                p1isRight = true;
            }
            if (guessp2 == targetNumber){
                p2isRight = true;
            }
            if(guessp3 == targetNumber){
                p3isRight = true;
            }
//If any player is right 
            if(p1isRight || p2isRight || p3isRight)
            {
                System.out.println("We have a winner!");
                System.out.println("Player one got it right? " + p1isRight);
                System.out.println("Player two got it right? "+ p2isRight);
                System.out.println("Player three got it right? "+p3isRight);
                System.out.println("Game is Over.");
                break;//game over , so break out the loop
            }
            else{
                //if any player didn't guessed it right
                System.out.println("Players will have to try agian.");
            }//end if/else

        }//end loop
    }//end method


}//end class

 class Player{
    int number = 0;
    public void guess(){
        number = (int) (Math.random() * 10);
        System.out.println("I am guessing " + number);
    }
    
    
}

 public class Gamelauncher {
    public static void main(String[] args) {
        GuessGame game = new GuessGame();
        game.startGame();
    }
}
