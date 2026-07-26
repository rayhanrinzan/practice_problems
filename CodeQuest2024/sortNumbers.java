import java.util.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
          String line = input.nextLine();
          String[] temp = line.split(",");
          ArrayList<Integer> arrList = new ArrayList<Integer>();
          for(int z = 0; z < temp.length; z++){
              arrList.add(Integer.valueOf(temp[z]));
          }
          Collections.sort(arrList);
          for(int i = 0; i < arrList.size(); i++){
              if(i == 0) System.out.print(arrList.get(i));
            else{
                System.out.print(",");
                System.out.print(arrList.get(i));
            }

          }


      }
      }
    }
}