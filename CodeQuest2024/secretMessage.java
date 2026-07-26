import java.util.*;
import java.lang.*;
import java.text.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
        int num = Integer.parseInt(input.nextLine());
        ArrayList<String> messageLines = new ArrayList<String>();
        for(int i = 0; i < num; i++){
            messageLines.add(input.nextLine());
        }
        
        int largestString = messageLines.get(0).length();
        for(int i = 1; i < messageLines.size(); i++){
            if(messageLines.get(i).length() > largestString) {
                largestString = messageLines.get(i).length();
            }
        }
        
        char[][] message = new char[num][largestString];
        for(int i = 0; i < message.length; i++){
            for(int ii = 0; ii < message[i].length; ii++){
                if(ii >= messageLines.get(i).length()){
                    break;
                }
                else message[i][ii] = messageLines.get(i).charAt(ii);
            }
        }
        String line = input.nextLine();
        String[] coords = line.split(",");
        int row = Integer.valueOf(coords[0]);
        int col = Integer.valueOf(coords[1]);

        num = Integer.parseInt(input.nextLine());
        ArrayList<String> keyStrings = new ArrayList<String>();
        for(int i = 0; i < num; i++){
            keyStrings.add(input.nextLine());
        }
        char[][] key = new char[num][keyStrings.get(0).length()];
        for(int i = 0; i < key.length; i++){
            for(int ii = 0; ii < key[i].length; ii++){
                key[i][ii] = keyStrings.get(i).charAt(ii);
            }
        }

        ArrayList<String> O = new ArrayList<String>();
        for(int i = 0; i < key.length; i++){
            for(int ii = 0; ii < key[i].length; ii++){
                if(key[i][ii] == 'O'){
                    O.add(String.valueOf(i+row) + "," + String.valueOf(ii+col));
                }
            }
        }

        String[] temp = new String[2];
        for(int i = 0; i < O.size(); i++){
            temp = O.get(i).split(",");
            row = Integer.valueOf(temp[0]);
            col = Integer.valueOf(temp[1]);
            System.out.print(message[row][col]);
        }
        System.out.println();
        
        
        
        
        
          
      }
      }
    }
}