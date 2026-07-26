import java.util.*;
import java.lang.*;
import java.text.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
          String line = input.nextLine();
          HashMap<String, String> phonebook = new HashMap<String, String>();
          phonebook.put("a","2");
          phonebook.put("b","22");
          phonebook.put("c","222");
          phonebook.put("d","3");
          phonebook.put("e","33");
          phonebook.put("f","333");
          phonebook.put("g","4");
          phonebook.put("h","44");
          phonebook.put("i","444");
          phonebook.put("j","5");
          phonebook.put("k","55");
          phonebook.put("l","555");
          phonebook.put("m","6");
          phonebook.put("n","66");
          phonebook.put("o","666");
          phonebook.put("p","7");
          phonebook.put("q","77");
          phonebook.put("r","777");
          phonebook.put("s","7777");
          phonebook.put("t","8");
          phonebook.put("u","88");
          phonebook.put("v","888");
          phonebook.put("w","9");
          phonebook.put("x","99");
          phonebook.put("y","999");
          phonebook.put("z","9999");
          phonebook.put(" ","0");
          for(int i = 0; i < line.length(); i++){
            if(i != line.length()-1){
            System.out.print(phonebook.get(line.substring(i,i+1)));
            System.out.print("-");
            }
            else{
            System.out.println(phonebook.get(line.substring(i,i+1)));
            }
          }
          
      }
      }
    }
}