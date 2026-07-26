import java.util.*;
import java.lang.*;
import java.text.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
          HashMap<String, String> phonebook = new HashMap<String, String>();
          phonebook.put("G", "1");
          phonebook.put("C", "1");
          phonebook.put("A", "0");
          phonebook.put("T", "0");
          String line = input.nextLine();
          int temp = line.length()/7;
          ArrayList<String> arrList = new ArrayList<String>();

          for(int i = 0; i < line.length(); i+=7){
              arrList.add(line.substring(i, i+7));
          }
          ArrayList<String> arrList2 = new ArrayList<String>();
          String str;
          String newStr;
        //   for(int i = 0; i < arrList.size(); i++){
        //       System.out.println(arrList.get(i));
        //   }
          for(int i = 0; i < arrList.size(); i++){
              str = arrList.get(i);
              newStr = "";
              for(int x = 0; x < str.length(); x++){
                  newStr += phonebook.get(str.substring(x,x+1));
              }
              arrList2.add(newStr);
          }
          int asciiVal;
          for(int i = 0; i < arrList2.size(); i++){
              str = arrList2.get(i);
              asciiVal = Integer.parseInt(str, 2);
              str = new Character((char) asciiVal).toString();
              System.out.print(str);
          }
          System.out.println();
          
      }
      }
    }
}