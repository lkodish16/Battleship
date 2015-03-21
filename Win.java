
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
      return true;
    }
    else
    {
      return false;
    }
  }
}
