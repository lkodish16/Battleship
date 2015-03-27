import java.util.Scanner;

public class Battleship
{
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);  
    PlayerTurn friendlyTurn = new PlayerTurn();  // PlayerTurn class object
    EnemyTurn enemyTurn = new EnemyTurn();  // EnemyTurn class object 
    Boolean playerWin = false;
    Boolean enemyWin = false;
    // parts of the game board (5x5 game board, 36x9 characters)
    String defaultBoard = "___________________________________\n" + 
      "|   |  A  |  B  |  C  |  D  |  E  |\n" +  
      "|---|-----------------------------|\n" + 
      "| 1 |  A1 |  B1 |  C1 |  D1 |  E1 |\n" +
      "| 2 |  A2 |  B2 |  C2 |  D2 |  E2 |\n" + 
      "| 3 |  A3 |  B3 |  C3 |  D3 |  E3 |\n" +
      "| 4 |  A4 |  B4 |  C4 |  D4 |  E4 |\n" +
      "| 5 |  A5 |  B5 |  C5 |  D5 |  E5 |\n" +
      "|_________________________________|\n"; 
    
    String playerBoard = "___________________________________\n" + 
      "|   |  A  |  B  |  C  |  D  |  E  |\n" +  
      "|---|-----------------------------|\n" + 
      "| 1 |  A1 |  B1 |  C1 |  D1 |  E1 |\n" +
      "| 2 |  A2 |  B2 |  C2 |  D2 |  E2 |\n" + 
      "| 3 |  A3 |  B3 |  C3 |  D3 |  E3 |\n" +
      "| 4 |  A4 |  B4 |  C4 |  D4 |  E4 |\n" +
      "| 5 |  A5 |  B5 |  C5 |  D5 |  E5 |\n" +
      "|_________________________________|\n"; 
    
    String enemyBoard = "___________________________________\n" + 
      "|   |  A  |  B  |  C  |  D  |  E  |\n" +  
      "|---|-----------------------------|\n" + 
      "| 1 |  A1 |  B1 |  C1 |  D1 |  E1 |\n" +
      "| 2 |  A2 |  B2 |  C2 |  D2 |  E2 |\n" + 
      "| 3 |  A3 |  B3 |  C3 |  D3 |  E3 |\n" +
      "| 4 |  A4 |  B4 |  C4 |  D4 |  E4 |\n" +
      "| 5 |  A5 |  B5 |  C5 |  D5 |  E5 |\n" +
      "|_________________________________|\n"; 
    
    
    // print out game board.
    System.out.println(playerBoard);
    /*
     System.out.println(topBorder);
     System.out.println(firstRow);
     System.out.println(border);
     System.out.println(secondRow);
     System.out.println(border);
     System.out.println(thirdRow);
     System.out.println(border);
     System.out.println(fourthRow);
     System.out.println(border);
     System.out.println(fifthRow);
     System.out.println(border);
     System.out.println(sixthRow);
     System.out.println(border);
     System.out.println(seventhRow);
     System.out.println(border);
     System.out.println(eigthRow);
     System.out.println(bottomBorder);
     */
    
    // ask player number of ships he wants to play the game with.
    System.out.println("How many ships do you want to play with? (Enter a number)");
    int shipNum = input.nextInt();
    while (shipNum > 25)  // a check so there aren't more ships than spaces on the board. 
    {
      System.out.println("How many ships do you want to play with? (Enter a number)");
      shipNum = input.nextInt();
    }
    
    // create a ShipSetup object and run the shipSetup method to place ships on the board.
    ShipSetup setup = new ShipSetup();
    playerBoard = setup.shipSetup(playerBoard, shipNum); 
    System.out.println(playerBoard);
    // call enemySetup method to place ships on enemy board at random locations.
    enemyBoard = setup.enemySetup(enemyBoard, shipNum);
    
    // until someone wins the game, have alternating methods for player and AI turns.
    Win winCheck = new Win();
    while (playerWin == false && enemyWin == false)
    {
      enemyBoard = friendlyTurn.playerTurn(enemyBoard, defaultBoard);
      playerWin = winCheck.playerWin(enemyBoard);
      if (playerWin == true)  // if the player has already won...
      {
        break;  // break out of the while loop so the enemy can't also win with their turn.
      }
      System.out.println(playerBoard);
      playerBoard = enemyTurn.enemyTurn(playerBoard, defaultBoard);  // otherwise go ahead with the enemy's turn.
      enemyWin = winCheck.enemyWin(playerBoard);
    }
    
    
    
    
    
    
    /* System.out.println("____________________________________________________ "); // border
     System.out.println("|   |  A  |  B  |  C  |  D  |  E  |  F  |  G  |  H  |");  // x-axis
     System.out.println("|---|-----------------------------------------------|"); // border
     // y-axis and contents of game board.
     System.out.println("| 1 |  A1 |  B1 |  C1 |  D1 |  E1 |  F1 |  G1 |  H1 |");
     System.out.println("|---|-----------------------------------------------|"); // border
     System.out.println("| 2 |  A2 |  B2 |  C2 |  D2 |  E2 |  F2 |  G2 |  H2 |");
     System.out.println("|---|-----------------------------------------------|"); // border
     System.out.println("| 3 |  A3 |  B3 |  C3 |  D3 |  E3 |  F3 |  G3 |  H3 |");
     System.out.println("|---|-----------------------------------------------|"); // border
     System.out.println("| 4 |  A4 |  B4 |  C4 |  D4 |  E4 |  F4 |  G4 |  H4 |");
     System.out.println("|---|-----------------------------------------------|"); // border
     System.out.println("| 5 |  A5 |  B5 |  C5 |  D5 |  E5 |  F5 |  G5 |  H5 |");
     System.out.println("|---|-----------------------------------------------|"); // border
     System.out.println("| 6 |  A6 |  B6 |  C6 |  D6 |  E6 |  F6 |  G6 |  H6 |");
     System.out.println("|---|-----------------------------------------------|"); // border
     System.out.println("| 7 |  A7 |  B7 |  C7 |  D7 |  E7 |  F7 |  G7 |  H7 |");
     System.out.println("|---|-----------------------------------------------|"); // border
     System.out.println("| 8 |  A8 |  B8 |  C8 |  D8 |  E8 |  F8 |  G8 |  H8 |");
     System.out.println("|___________________________________________________|"); // border */
  }
}