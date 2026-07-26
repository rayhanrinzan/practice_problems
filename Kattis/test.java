import java.util.*;
import java.lang.*;
import java.text.*;
public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int c = Integer.parseInt(input.nextLine());
        for(int x = 0; x < c; x++){
        String[] arr = input.nextLine().split(" ");
        int count = 0;
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += Integer.valueOf(arr[i]);
        }
        double what = (double)sum/arr.length;

        for(int i = 0; i < arr.length; i++){
            if(Integer.valueOf(arr[i]) > what) count++;
        }
                System.out.println(count);

         what = (double)count / arr.length;
        System.out.println(what);
}

        
        
    }
}