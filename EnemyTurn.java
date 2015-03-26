import java.util.Scanner;

public class EnemyTurn {
  public String enemyTurn(String playerBoard, String defaultBoard)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Where do you want to attack?");
    String coord = input.nextLine();
    int coordLocation = defaultBoard.indexOf(coord);
    int shipsLeft = 0;
    
    if  (playerBoard.substring(coordLocation,coordLocation+2).equals("XX"))  // if the AI correctly guesses where one your ships is...
    {
      System.out.println("The enemy sunk your ship located at " + coord + "!");
      playerBoard = playerBoard.substring(0,coordLocation) + coord + playerBoard.substring(coordLocation+2);  // rewrite the board 
    }
    else
    {
      System.out.println("The Enemy missed!");
    }
    
    for (int i = 0; i < playerBoard.length()-2; i++)
    {
      if (playerBoard.substring(i,i+2).equals("XX"))
      {
        shipsLeft++;
      }
    }
    System.out.println("You have " + shipsLeft + " ships left.");
    return playerBoard;
  }
  
  
}
