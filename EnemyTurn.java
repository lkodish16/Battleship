import java.util.ArrayList;

public class EnemyTurn {
  public String enemyTurn(String playerBoard, String defaultBoard)
  {
    String[] transferCoordinates = {"A1","B1","C1","D1","E1","A2","B2","C2","D2","E2","A3","B3","C3","D3",
      "E3","A4","B4","C4","D4","E4","A5","B5","C5","D5","E5"}; 
    ArrayList<String> possibleCoordinates = new ArrayList<String>();
    for (String x : transferCoordinates)  // transfer elements of array to the ArrayList.
    {
      possibleCoordinates.add(x);
    }
    String coord = possibleCoordinates.get((int)(Math.random()*possibleCoordinates.size()));  // takes random coordinate from ArrayList.
    possibleCoordinates.remove(coord);
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
    
    for (int i = 0; i < playerBoard.length()-2; i++)  // check how many ships are left. 
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
