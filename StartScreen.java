import java.util.Scanner;

public class StartScreen
{
  public boolean startScreen()
  {
    Scanner input = new Scanner(System.in);
    boolean realPlayer = false;
    System.out.println("Enter A to play with a real player.");
    System.out.println("Enter B to play with an AI player.");
    String answer = input.nextLine().toLowerCase();
    if (answer.equals("a")) // true means with another player
    {
      realPlayer = true;
    }
    else if (answer.equals("b"))  // false means play with an AI
    {
      realPlayer = false;
    }
    else
    {
      startScreen();
    }
    return realPlayer;
  }
}
    