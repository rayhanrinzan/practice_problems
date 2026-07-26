import java.util.*;
import java.lang.*;
import java.text.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
          String line = input.nextLine();
          String[] words = line.split(" ");
      
          for(int i = 0; i < words.length; i++){
              String str = words[i];
              StringBuilder newStr = new StringBuilder(words[i].length());
               ArrayList<Integer> capitalizePosition = new ArrayList<Integer>();

              for (int x = 0; x < str.length(); x++) {
                  if (Character.isUpperCase(str.charAt(x))) {
                     if (str.length() == 1) {
                         capitalizePosition.add(0);

                     }
                     else if(str.length() % 2 != 0) {
                         capitalizePosition.add(Math.abs((str.length()-2) - x));

                     }
                     
                     else{
                         capitalizePosition.add(Math.abs((str.length()-1) - x));

                     }
                      
                  }
              }
              for(int x = 0; x < str.length(); x++){
                  if(Character.isLetter(str.charAt(x))){
                      if(capitalizePosition.contains(x)){


                        newStr.insert(0, Character.toUpperCase(str.charAt(x)));
                      }
                      else{
                        newStr.insert(0, Character.toLowerCase(str.charAt(x)));
                      }
                  }
                  else{
                       newStr.insert(x, str.charAt(x));
                  }
              }
              if(i == words.length-1){
                  System.out.println(newStr);
              }
              else{
                  System.out.print(newStr+ " ");
              }
          }

          
      }
      }
    }
}