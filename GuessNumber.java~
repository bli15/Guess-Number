import java.util.Scanner;
public class GuessNumber
{
  public static void main (String[] args)
  {
    boolean won = false; //keeps track of win or loss
    boolean firstGame = true; //allows us to do things once
    boolean skip = false; //lets me skip display of guesses
    int guessNumber = 1; //keeps track of number of guesses
    Scanner input = new Scanner(System.in);
    System.out.println("Do you want to play? Or do you want the computer to play?");
    System.out.print("Type 1 for computer, or 2 for Human.");
    int humanOrComp = input.nextInt();
    System.out.println("Welcome to the Guessing game! Pick a maximum number!");
    int max = input.nextInt(); //input = your max number to generate
    System.out.println("Choose a minimum number to guess");
    int min = input.nextInt(); //input = your min number to generate
    if (max < min) {
      System.out.println(max +" isn't greater than "+min +" silly!");
      won = true;
      firstGame = false;
      skip = true;
    }
    
    int answer = (int)(Math.random()*max+min); //random number between min and max
    int prevGuess = 0; //keeps track if guess was too high or too low
    Computer comp = new Computer(); //lets us use Computer.java
    Player player = new Player();
    if (firstGame == true){
    System.out.println("I'm thinking of a number between " +min +" and " +max);
      System.out.println("What's your guess?");
      firstGame = false;
    }
      comp.max(max);
      comp.min(min); //sends max and min values to Computer.java
    while(won == false) //loop that continues until player guesses correctly
    { if (humanOrComp == 1){
      int guess = comp.play(prevGuess); //takes guess from Player
      if (guess > answer) {//if it's too high, sets previous guess 1 for too high and increments guesses by 1
        prevGuess = 1;
        guessNumber++;
      }
      if (guess < answer) {//if it's too low, sets previous guess to -1 and increments guesses by 1
        prevGuess = -1;
        guessNumber++;
      }
      if (guess == answer) won = true;//if you win, then stops loop
    }
    if (humanOrComp == 2){
      int guess = player.play(prevGuess); //takes guess from Player
      if (guess > answer) {//if it's too high, sets previous guess 1 for too high and increments guesses by 1
        prevGuess = 1;
        guessNumber++;
      }
      if (guess < answer) {//if it's too low, sets previous guess to -1 and increments guesses by 1
        prevGuess = -1;
        guessNumber++;
      }
      if (guess == answer) won = true;//if you win, then stops loop
    }
    }
    
   
 if (skip == false) System.out.println("You got it right! Good job! You guessed it in "+guessNumber +" guesses!");// if max is < min, skips displaying this
  }
}