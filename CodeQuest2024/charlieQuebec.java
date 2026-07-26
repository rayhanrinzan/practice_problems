import java.util.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
          int numLines = input.nextInt();
          input.nextLine();
          String[] arr = {"Alpha", "Bravo", "Charlie", "Delta", "Echo", "Foxtrot", "Golf", "Hotel", "India", "Juliet", "Kilo", "Lima", "Mike", "November", "Oscar", "Papa", "Quebec", "Romeo", "Sierra", "Tango", "Uniform", "Victor", "Whiskey", "Xray", "Yankee", "Zulu", " "};
          for(int z = 0; z < numLines; z++){
              String old = input.nextLine();
              String message = "";
              for(int i = 0; i < old.length(); i++){
                  String test = old.substring(i, i+1);
                  for(int x = 0; x < arr.length; x++){
                      if((test.toLowerCase()).equals(arr[x].substring(0,1).toLowerCase())){
                          if(test.equals(old.substring(0,1)) || test.equals(" ") || old.substring(i-1,i).equals(" ")){
                          message += arr[x];
                          }
                        //   else if(old.substring(i-1,i).equals(" ")){
                        //       message += arr[x];
                        //   }
                          else{
                              message += "-" + arr[x];
                          }
                      }
                  }
              }
              System.out.println(message);
          }
          
          
          
      }
      }
    }
}