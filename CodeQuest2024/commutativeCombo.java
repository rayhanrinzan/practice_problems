import java.util.*;
import java.lang.*;
import java.text.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
        //take sum
        int sum = Integer.valueOf(input.nextLine().substring(9));
        //take nums into arr
        String[] arr = input.nextLine().split(",");
        //convert arr to list
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++){
            arrList.add(Integer.valueOf(arr[i]));
        }
        //sort list
        Collections.sort(arrList);
        //put list, size, newlist, and sum into recursive method
        ArrayList<Integer> newList = new ArrayList<Integer>();
        sumFinder(arrList, arrList.size(), newList, sum);
          
          
      }
      }
    }
    //define recursive method
    public static void sumFinder(ArrayList<Integer> nums, int size, ArrayList<String> sumList, int sum){
    //if size is 1, iterate through sumList and print

    //go through list and see if numbers up to size add to make sum
        for(int i = 0; i < nums.size(); i++){
            
        }
    //code to check all combos
    //call on method with size-1
    }
    
}