import java.util.*;
import java.lang.*;
import java.text.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
          boolean x = false;
          boolean o = false;
          String line = input.nextLine();
          String line1 = line.substring(0, 3);
          String line2 = line.substring(3, 6);
          String line3 = line.substring(6, 9);
          char[][] grid = {
            {line1.charAt(0),line1.charAt(1),line1.charAt(2)},
            {line2.charAt(0),line2.charAt(1),line2.charAt(2)},
            {line3.charAt(0),line3.charAt(1),line3.charAt(2)}
          };
        
          for(int i = 0; i < grid.length; i++){
              if(grid[i][0] == grid[i][1] && grid[i][1] == grid[i][2]){
                  if(grid[i][0] == 'X'){
                      x = true;
                  }
                  if(grid[i][0] == 'O'){
                      o = true;
                  }
              }
          }
          for(int i = 0; i < grid.length; i++){
              if(grid[0][i] == grid[1][i] && grid[1][i] == grid[2][i]){
                  if(grid[0][i] == 'X'){
                      x = true;
                  }
                  if(grid[0][i] == 'O'){
                      o = true;
                  }
              }
          }
          if(grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2]){
              if(grid[0][0] == 'X'){
                      x = true;
                  }
              if(grid[0][0] == 'O'){
                      o = true;
                  }
          }
          if(grid[0][2] == grid[1][1] && grid[1][1] == grid[2][0]){
              if(grid[0][2] == 'X'){
                      x = true;
                  }
              if(grid[0][2] == 'O'){
                      o = true;
                  }
          }
          if(x){
              System.out.println(line + " = " + "X WINS");
          }
          else if(o){
              System.out.println(line + " = " + "O WINS");
          }
          else{
              System.out.println(line + " = " + "TIE");
          }
          
      }
      }
    }
}