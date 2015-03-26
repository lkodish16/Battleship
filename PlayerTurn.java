import java.util.Scanner; 

public class PlayerTurn {
  public String playerTurn(String enemyBoard, String defaultBoard)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Where do you want to attack?");  // asks player where they want to attack.
    String coord = input.nextLine(); 
    int coordLocation = defaultBoard.indexOf(coord);  // find the location of the coordinate on a blank gameboard.
    int enemyShipsLeft = 0;
    
    if  (enemyBoard.substring(coordLocation,coordLocation+2).equals("XX"))  // if the player correctly guesses where an enemy ship is.
    {
      System.out.println("You sunk an enemy ship located at " + coord + "!");
      enemyBoard = enemyBoard.substring(0,coordLocation) + coord + enemyBoard.substring(coordLocation+2);  // rewrite the board 
    }
    else
    {
      System.out.println("You Missed!");
    }
    
    for (int i = 0; i < enemyBoard.length()-2; i++)
    {
      if (enemyBoard.substring(i,i+2).equals("XX"))
      {
        enemyShipsLeft++;
      }
    }
    
    System.out.println("The enemy has " + enemyShipsLeft + " ships left.");
    return enemyBoard;
  }
}
  

