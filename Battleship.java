import java.util.Scanner;

public class Battleship
{
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);  
    StartScreen start = new StartScreen();
    ShipSetup setup = new ShipSetup();
    PlayerTurn friendlyTurn = new PlayerTurn();  // PlayerTurn class object
    AITurn robotTurn = new AITurn();  // EnemyTurn class object 
    Player2 player2 = new Player2(); // Player2 class object
    Win winCheck = new Win();
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
    
    String playerTwoBoard = "___________________________________\n" + 
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
    // ask player whether they want to play with another person or an AI.
    boolean chooseEnemy = start.startScreen();
    
    // ask player number of ships he wants to play the game with.
    System.out.println("How many ships do you want to play with? (Enter a number)");
    int shipNum = input.nextInt();
    while (shipNum > 25)  // a check so there aren't more ships than spaces on the board. 
    {
      System.out.println("How many ships do you want to play with? (Enter a number)");
      shipNum = input.nextInt();
    }
    
    if (chooseEnemy)  // if playing with another real person.
    {
      // create a ShipSetup object and run the shipSetup method to place ships on the board.
      playerBoard = setup.shipSetup(playerBoard, shipNum); 
      System.out.println(playerBoard);
      // call enemySetup method to place ships on enemy board at random locations.
      enemyBoard = setup.enemySetup(enemyBoard, shipNum);
      
      // until someone wins the game, have alternating methods for player and AI turns.
      while (playerWin == false && enemyWin == false)
      {
        enemyBoard = friendlyTurn.playerTurn(enemyBoard, defaultBoard);
        playerWin = winCheck.playerWin(enemyBoard);
        if (playerWin == true)  // if the player has already won...
        {
          break;  // break out of the while loop so the enemy can't also win with their turn.
        }
        System.out.println(playerBoard);
        playerBoard = robotTurn.enemyTurn(playerBoard, defaultBoard);  // otherwise go ahead with the enemy's turn.
        enemyWin = winCheck.enemyWin(playerBoard);
      }
    }
    else // if the player is playing with an AI.
    {
      // create a ShipSetup object and run the shipSetup method to place ships on the board.
      playerBoard = setup.shipSetup(playerBoard, shipNum); 
      System.out.println(playerBoard);
      // call enemySetup method to place ships on enemy board at random locations.
      playerTwoBoard = setup.shipSetup(enemyBoard, shipNum);
      
      // until someone wins the game, have alternating methods for player and AI turns.
      while (playerWin == false && enemyWin == false)
      {
        enemyBoard = friendlyTurn.playerTurn(enemyBoard, defaultBoard);
        playerWin = winCheck.playerWin(enemyBoard);
        if (playerWin == true)  // if the player has already won...
        {
          break;  // break out of the while loop so the enemy can't also win with their turn.
        }
        System.out.println(playerBoard);
        playerBoard = robotTurn.enemyTurn(playerBoard, defaultBoard);  // otherwise go ahead with the enemy's turn.
        enemyWin = winCheck.enemyWin(playerBoard);
      }
    }
  }
}