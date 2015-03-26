import java.util.Scanner;

public class EnemyTurn {
  public String enemyTurn(String playerBoard, String defaultBoard)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Where do you want to attack?");
    String coord = input.nextLine();
    int coordLocation = defaultBoard.indexOf(coord);
    
    
    if (playerBoard.substring(coordLocation,coordLocation+2).equals("XX"))
    {
      System.out.println("The enemy sunk your ship located at " + coord + "!");
      playerBoard = playerBoard.replaceAll(coord, "**");
    }
    else
    {
      System.out.println("The Enemy missed!");
    }
    return playerBoard;
  }
  
  
}
