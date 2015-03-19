import java.util.Scanner;

public class PlayerTurn {
  public String playerTurn(String enemyBoard, String gameBoard)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Where do you want to attack?");
    String coord = input.nextLine();
    
    
    for (int i = 0; i < enemyBoard.length()-2; i++)
    {
      if ()
      {
        System.out.println("You hit an enemy ship located at " + coord + "!");
        enemyBoard = enemyBoard.replaceAll(coord, "**");
      }
      else if (i == enemyBoard.length()-2)
      {
        System.out.println("You Missed!");
      }
      else
      {
        // do nothing
      }
    }
    return enemyBoard;
  }
}
