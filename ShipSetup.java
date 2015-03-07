public class ShipSetup
{ // pass the game board so that you can modify it 
  // take two coordinates that will act as the range for the ship's placement
  // compare the two coordinates to see whether the ship is placed vertically or horizontally
  // 
  
  public void shipSetup(String one, String two, 
                        String three, String four, String five, String six, 
                        String seven, String eight, String coor1, String coor2)
  {
    String topBorder = "____________________________________________________ ";
    String yAxis = "|   |  A  |  B  |  C  |  D  |  E  |  F  |  G  |  H  |";
    String border = "|---|-----------------------------------------------|"; 
    String firstRow = one;
    String secondRow = two;
    String thirdRow = three;
    String fourthRow = four;
    String fifthRow = five;
    String sixthRow = six;
    String seventhRow = seven;
    String eigthRow = eight;
    String bottomBorder = "|___________________________________________________|"; 
    String coordinate1 = coor1.trim();  // trim ends of string for substring purposes
    String coordinate2 = coor2.trim();  // trim ends of string for substring purposes
    
    // find out if ship will be vertical or horizontal
    boolean vertical = false;
    boolean horizontal = false;
    if (coordinate1.substring(0,1).equals(coordinate2.substring(0,1)) &&
        !coordinate1.substring(1,2).equals(coordinate2.substring(1,2)))
    {
      vertical = true;
    }
    else if (!coordinate1.substring(0,1).equals(coordinate2.substring(0,1)) &&
        coordinate1.substring(1,2).equals(coordinate2.substring(1,2)))
    {
      horizontal = true;
    }
    else
    {
      return;
    }
  }
} 
  