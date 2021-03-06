import java.util.Scanner;

public class Player2 {
  public String playerTwoTurn(String playerBoard, String defaultBoard)
  {
    String[] possibleCoordinates = {"A1","B1","C1","D1","E1","A2","B2","C2","D2","E2","A3","B3","C3","D3",
      "E3","A4","B4","C4","D4","E4","A5","B5","C5","D5","E5"};  // list of possible coordinates
    boolean realCoordinate = false;
    Scanner input = new Scanner(System.in);
    System.out.println("Player2, Where do you want to attack?");  // asks player where they want to attack.
    String coord = input.nextLine(); 
    for (String x : possibleCoordinates)  // references inputted coordinate with list of possible coordinates.
    {
      if (coord.equals(x))
      {
        realCoordinate = true;
      }
    }
    
    if (realCoordinate == false)  // if the coordinate isn't in the list of possible coordinates...
    {
      playerTwoTurn(playerBoard, defaultBoard);  // call recursive method until the player inputs a legitimate coordinate.
    }
      
    int coordLocation = defaultBoard.indexOf(coord);  // find the location of the coordinate on a blank gameboard.
    int enemyShipsLeft = 0;  
    
    if  (playerBoard.substring(coordLocation,coordLocation+2).equals("XX"))  // if the player correctly guesses where an enemy ship is.
    {
      System.out.println("You sunk an enemy ship located at " + coord + "!");
      playerBoard = playerBoard.substring(0,coordLocation) + coord + playerBoard.substring(coordLocation+2);  // rewrite the board 
    }
    else
    {
      System.out.println("You Missed!");
    }
    
    for (int i = 0; i < playerBoard.length()-2; i++)
    {
      if (playerBoard.substring(i,i+2).equals("XX"))
      {
        enemyShipsLeft++;
      }
    }
    
    System.out.println("The enemy has " + enemyShipsLeft + " ships left.");
    return playerBoard;
  }
}

