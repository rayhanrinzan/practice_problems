import java.util.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
          int n = input.nextInt();
          input.nextLine();
          for(int i = 0; i < n; i++){
              String[] arr = input.nextLine().split(" ");
              if(arr[0].length() >= 9 && arr[0].substring(arr[0].length()-9).equals(".lmco.com")){
                  continue;
              }
              else{
                  if(Integer.valueOf(arr[1]) > 1000){
                      System.out.println(arr[0] + " " + arr[1]);
                  }
              }
          }
          
          
      }
      }
    }
}