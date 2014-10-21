public class Computer
{
  private int guess;//the number to return to GuessNumber (the computers guess)
  private int lastGuess;//memory for the last guess
  private int up; //local maximum value
  private int down; //local minimum value
  public void max(int max) //takes max value from GuessNumber
  {
    up = max;
  }
  
  public void min(int min)// takes min value from GuessNumber
  {
    down = min;
  }
  
  public int play(int prevGuess)//checks if the previous guess is too high or too low
  {
    if (prevGuess == 0) //first guess is average of max and min
    {
      guess = (int)((up+down)/2);
      System.out.println("I guess " +guess +"!");
    }
    if (prevGuess == 1){ // if previous guess is too high, prints too high, then sets maximum value to the last guess
        up = lastGuess;
        System.out.println("Too high, guess again!");
        guess = ((up+down)/2); //takes average of new max and min
        System.out.println("I guess "+guess +"!");
      }
    if (prevGuess == -1){ // if previous guess is too low, prints too low, then sets minimum value to the last guess
        down = lastGuess;
        System.out.println("Too low, guess again!");
        guess = ((up+down)/2);//takes average of new max and min
        System.out.println("I guess "+guess +"!");
      }
    lastGuess = guess;//stores last guess as the current guess
    return guess;//returns a number to the driver
  }
}