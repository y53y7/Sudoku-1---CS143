import java.io.*;
import java.util.*;

public class SudokuBoard {
   private char[][] board;
   
   public SudokuBoard(String filename) {
      try {
         Scanner scan = new Scanner(new File(filename));
         board = new char[9][9];
         for(int r = 0; r < board.length; r++) {
            if(scan.hasNextLine()) {
               String line = scan.nextLine();
               for(int c = 0; c < board[0].length; c++) {
                  board[r][c] = line.charAt(c);
               }
            }
         }
      } catch(FileNotFoundException e) {
         System.out.println("Cannot find " + filename);
      }
   }
   
   public String toString() {
      String s = "";
      for(int r = 0; r < board.length; r++) {
         for(int c = 0; c < board[0].length; c++) {
            s += board[r][c] + " ";
         }
      s += "\n";
      }
      
      return s;
   }
}

/*
 2 . . 1 . 5 . . 3 
 . 5 4 . . . 7 1 . 
 . 1 . 2 . 3 . 8 . 
 6 . 2 8 . 7 3 . 4 
 . . . . . . . . . 
 1 . 5 3 . 9 8 . 6 
 . 2 . 7 . 1 . 6 . 
 . 8 1 . . . 2 4 . 
 7 . . 4 . 2 . . 1 
 
*/