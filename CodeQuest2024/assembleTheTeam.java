import java.util.*;
import java.lang.*;
import java.text.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
        String[] arr = input.nextLine().split(" ");
        HashMap<Integer, String> agents = new HashMap<Integer, String>();
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++){
            String[] temp = arr[i].split("=");
            agents.put(Integer.valueOf(arr[1]), arr[0]);
            nums.add(Integer.valueOf(arr[1]));
            
        }
        for(int i = 0; i < nums.size(); i++){
            Collections.sort(nums);
            if()
        }
          
          
      }
      }
    }
}