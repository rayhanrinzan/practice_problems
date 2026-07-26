import java.util.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
          int num = input.nextInt();
        ArrayList<Integer> arrList = new ArrayList<Integer>();
          for(int i = 0; i < num-1; i++){
              arrList.add(input.nextInt());
          }
          ArrayList<Integer> finalList = new ArrayList<Integer>();
          for(int i = 1; i <= num; i++){
              if(!(arrList.contains(i))){
                 finalList.add(i);
              }
          }
          for(int i = 0; i < finalList.size(); i++){
              System.out.println(finalList.get(i));
          }
          
          
      }
      }
    }
}