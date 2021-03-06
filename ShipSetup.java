import java.util.Scanner;

public class ShipSetup
{ 
  public String shipSetup(String board, int shipNum)
  {
    // initialize the scanner
    Scanner input = new Scanner(System.in);
    int count = 0;
    
    // ask the player where he wants to place his ships, and then mark them on the board with XX. 
    while (count < shipNum)
    {
      System.out.println("What coordinate do you want to place ship " + (count+1) + " at? (Ex. A1, B3)");
      String coord = input.nextLine();
      
      for (int i = 115; i < board.length()-2; i++)
      {
        if (board.substring(i,i+2).equals(coord))
        {
          board = board.replaceAll(coord, "XX");
          count++;
        }
      }
    }
    System.out.println("\nYour ships have been placed on the game board!");
    return board;
  }
  
  public String enemySetup(String enemyBoard, int shipNum)
  {
    int count = 0;
    String enemyCoord = ""; // string that holds the value of the array that will be placed.
    String[] boardArr = {"A1", "B1", "C1", "D1", "E1",
      "A2", "B2", "C2", "D2", "E2",
      "A3", "B3", "C3", "D3", "E3",
      "A4", "B4", "C4", "D4", "E4",
      "A5", "B5", "C5", "D5", "E5"};
    
    while (count < shipNum)
    {
      int randomPlace = (int)(Math.random()*24);
      if (!boardArr[randomPlace].equals("XX"))
      {
        // find where randomPlace is on enemyBoard and replace it with XX in the enemyBoard string
        enemyCoord = boardArr[randomPlace];
        for (int i = 115; i < enemyBoard.length()-2; i++)
        {
          if (enemyBoard.substring(i,i+2).equals(enemyCoord))
          {
            enemyBoard = enemyBoard.replaceAll(enemyCoord, "XX");
            count++;
          }
        }
        boardArr[randomPlace] = "XX";
      }
    }
    return enemyBoard;  // return the enemyBoard after it's had the enemy ships placed on it. 
  }
} 





