import java.util.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
          String line = input.nextLine();
          String greeting = line.substring(0, line.indexOf("|"));
          String reply = line.substring(line.indexOf("|") + 1);
          greeting = greeting.toLowerCase();
          reply = reply.toLowerCase();
          String g = "";
          String r = "";
          char temp;
          int val;
          for(int i = 0; i < greeting.length(); i++){
              temp = greeting.charAt(i);
              val = temp;
              if(val >= 97 && val <= 122){
                  g += temp;
              }
          }
          char temp2;
          int val2;
          for(int x = 0; x < reply.length(); x++){
              temp2 = reply.charAt(x);
              val2 = temp2;
              if(val2 >= 97 && val2 <= 122){
                  r += temp2;
              }
          }
          String temp3;
          boolean answer = true;
        for(int v = 0; v < r.length(); v++){
            temp3 = r.substring(v,v+1);
            if(!(g.contains(temp3))){
                //System.out.println(temp3);
                answer = false;
            }
        
        }
        //System.out.println(g);
        //System.out.println(r);
        if(answer){
            System.out.println("That's my secret contact!");
        }
        else{
            System.out.println("You're not a secret agent!");
        }
      }
      }
    }
}