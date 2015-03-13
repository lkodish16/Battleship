import java.util.Scanner;

public class Battleship
{
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    // parts of the game board (5x5 game board, 36x9 characters)
   
    String gameBoard = "___________________________________\n" + 
                       "|   |  A  |  B  |  C  |  D  |  E  |\n" +  
                       "|---|-----------------------------|\n" + 
                       "| 1 |  A1 |  B1 |  C1 |  D1 |  E1 |\n" +
                       "| 2 |  A2 |  B2 |  C2 |  D2 |  E2 |\n" + 
                       "| 3 |  A3 |  B3 |  C3 |  D3 |  E3 |\n" +
                       "| 4 |  A4 |  B4 |  C4 |  D4 |  E4 |\n" +
                       "| 5 |  A5 |  B5 |  C5 |  D5 |  E5 |\n" +
                       "|_________________________________|\n"; 
    
    // print out game board.
    System.out.println(gameBoard);
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
    
   /* // setup the ships
    System.out.println("What coordinate do you want to start at?");
    String coor1 = input.nextLine();
    System.out.println("What coordinate do you want to end at?");
    String coor2 = input.nextLine();
                     
    ShipSetup setup = new ShipSetup();
    setup.shipSetup(firstRow,secondRow,thirdRow,fourthRow,fifthRow,sixthRow,seventhRow,eigthRow,coor1,coor2); 
    */
        
    System.out.println(gameBoard);
    
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