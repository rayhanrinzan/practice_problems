import java.util.*;
import java.lang.*;
import java.text.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      
        String[] arr = input.nextLine().split(" ");
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        for(int i = 0; i < arr.length-2; i++){
            arrList.add(Integer.valueOf(arr[i]));
        }
        int sum = arrList.get(0);
        int num1;
        int num2;
        ArrayList<Integer> set1 = new ArrayList<Integer>();
        for(int i = 1; i < arrList.size(); i++){
            num1 = arrList.get(i);
            for(int x = 2; x < arrList.size(); x++){
                num2 = arrList.get(x);
                if((sum + num1 + num2) == Integer.valueOf(arr[6])){
                    arrList.remove(arrList.indexOf(num1));
                    arrList.remove(arrList.indexOf(num2));
                    arrList.remove(arrList.indexOf(sum));
                    set1.add(sum);
                    set1.add(num1);
                    set1.add(num2);
                }
            }
        }
        Collections.sort(set1);
        Collections.sort(arrList);
        for(int i = set1.size()-1; i >= 0; i--){
            System.out.print(String.valueOf(set1.get(i)) + " ");
        }
        for(int i = arrList.size()-1; i >= 0; i--){
            if(i != 0){
                System.out.print(String.valueOf(arrList.get(i)) + " ");
            }
            else{
                System.out.print(String.valueOf(arrList.get(i)));
            }
        }

          
          
      }
      
    }
    
}