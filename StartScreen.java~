import java.util.Scanner;

public class StartScreen
{
  public boolean startScreen()
  {
    Scanner input = new Scanner(System.in);
    boolean realPlayer = false;
    
    System.out.println("                                WELCOME TO BATTLESHIP!");
    System.out.println("                                      # #  ( )\n" + 
"                                   ___#_#___|__\n" +
"                               _  |____________|  _ \n" +
"                      _   =====| | |            | | |==== \n" +
"                =====| |.---------------------------. | |====\n" +
"  <--------------------'   .  .  .  .  .  .  .  .   '--------------/\n" +
"    \\                                                             /\n" +
"     \\___________________________________________SS_Kiang________/\n" +
"  wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww\n" +
"wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww\n" +
"   wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww");
    System.out.println("RULES: *You will place ships on your game board, as will your opponent.\n" 
                         + " *You destroy enemy ships by guessing what coordinates they're on.\n"
                         + " *You and your opponent alternate turns guessing.\n"
                         + " *You win the game by destroying all of your enemy's ships.\n"
                         + "You can play with either a real player or a computer AI!");
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

    