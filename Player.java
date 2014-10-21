import java.util.Scanner;//imports scanner
public class Player
{
  Scanner input = new Scanner(System.in);//creates new scanner
  public int play(int prevGuess)//checks if previous guess is too high or too low
  {
    
    if (prevGuess == 1){ // if previous guess is too high, prints too high
        System.out.println("Too high, guess again!");
      }
    if (prevGuess == -1){ // if previous guess is too low, prints too low
        System.out.println("Too low, guess again!");
      }
   int guess = input.nextInt();//takes input and sets it as guess
    
    String a = (int)3.14 + "";
    return guess;//returns int to driver
  }
  
  
}