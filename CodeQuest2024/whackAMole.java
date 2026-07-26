import java.util.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
          String str = input.nextLine();
          String[] arr = str.split(" "); 
          ArrayList<Integer> arrList = new ArrayList<Integer>();
          for(int i = 1; i < arr.length + 1; i++){
              if(arr[i-1].equals("M")) arrList.add(i);
          }
          for(int i = 0; i < arrList.size(); i++){
              if(i == arrList.size()-1){
                  System.out.println(arrList.get(i));
              }
              else System.out.print(arrList.get(i) + " ");
          }
      }
      }
    }
}