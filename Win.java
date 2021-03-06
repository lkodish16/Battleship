public class Win {
  public Boolean playerWin(String enemyBoard)
  {
    int enemyShipCount = 0;
    // count enemy ships to see if player has won.
    for (int i = 0; i < enemyBoard.length()-2; i++)
    {
      if (enemyBoard.substring(i,i+2).equals("XX"))
      {
        enemyShipCount++;
      }
    }
    if (enemyShipCount == 0)
    {
      System.out.println("You have won the game!");
      return true;
    }
    else
    {
      return false;
    }
  }
  
  public Boolean enemyWin(String playerBoard)
  {
    int playerShipCount = 0;
    // count player ships to see if enemy has won. 
    for (int i = 0; i < playerBoard.length()-2; i++)
    {
      if (playerBoard.substring(i,i+2).equals("XX"))
      {
        playerShipCount++;
      }
    }
    if (playerShipCount == 0)
    {
      System.out.println("The enemy has won the game.");
      return true;
    }
    else
    {
      return false;
    }
  }
  
  public boolean playerOneWin(String playerTwoBoard)
  {
    int playerTwoShipCount = 0;
    // count player ships to see if enemy has won. 
    for (int i = 0; i < playerTwoBoard.length()-2; i++)
    {
      if (playerTwoBoard.substring(i,i+2).equals("XX"))
      {
        playerTwoShipCount++;
      }
    }
    if (playerTwoShipCount == 0)
    {
      System.out.println("Player 1 has won the game!");
      return true;
    }
    else
    {
      return false;
    }
  }
  
  public Boolean playerTwoWin(String playerOneBoard)
  {
    int playerShipCount = 0;
    // count player ships to see if enemy has won. 
    for (int i = 0; i < playerOneBoard.length()-2; i++)
    {
      if (playerOneBoard.substring(i,i+2).equals("XX"))
      {
        playerShipCount++;
      }
    }
    if (playerShipCount == 0)
    {
      System.out.println("Player 2 has won the game!");
      return true;
    }
    else
    {
      return false;
    }
  }
}

