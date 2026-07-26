import java.util.*;
import java.lang.*;
import java.text.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
          int row = input.nextInt();
          int col = input.nextInt();
          boolean bad = false;
          
          input.nextLine();
          String[][] oGrid = new String[row][col];
          for(int i = 0; i < row; i++){
              String str = input.nextLine();
              //if(!(str.substring(str.length()-1).equals(","))){
              String[] arr = str.split(",");
              
              for(int x = 0; x < arr.length; x++){
                  oGrid[i][x] = arr[x];
              }
              
              
                  
              }
          
          String[][] nGrid = new String[col][row];
          for(int i = 0; i < oGrid.length;i++){
              for(int x = 0; x < oGrid[i].length;x++){
                 
                 nGrid[x][i] = oGrid[i][x];
              }
              
          }
          for(int i = 0; i < nGrid.length; i++){
              for(int x = 0; x < nGrid[i].length; x++){
                  String temp = nGrid[i][x];
                  if(x != nGrid[i].length-1){
                  if(temp == null) System.out.print("" + ",");
                  else System.out.print(temp + ",");
                  }
                  else{
                      if(temp == null) System.out.print("");
                       else System.out.print(temp);
                  }
              }
              System.out.println();
          }
          
          
          
          
      }
      }
    }
}