import java.util.*;
import java.lang.*;
import java.text.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int x= 0; x< testCases; x++) {
            int y = Integer.parseInt(input.nextLine());
            int a = y%19;
            int b = y%4;
            int c = y%7;
            double k = Math.floor(y/100);
            double p = Math.floor((13 + 8*k)/25);
            double q = Math.floor(k/4);
            double m = (15-p+k-q)%30;
            double n = (4 + k - q)%7;
            double d = (19*a + m)%30;
            double e = (2*b + 4*c + 6*d + n)%7;
            double f = (11*m+11)%30;
            double date = 22 + d + e;
            int month;
            if(date <= 31){
                month = 3;
            }
            else{
                date -= 31;
                month = 4;
            }
            int dayNum = (int)date;
            String day = "";
            if(dayNum < 10){
                day += "0";
                day += String.valueOf(dayNum);
            }
            else{
                day += String.valueOf(dayNum);
            }
            if(month == 4 && day.equals("25") && d == 28 && e == 6 && f < 19){
                System.out.println(y + "/04/18");
            }
            else if(month == 4 && day.equals("26") && d == 29 && e == 6){
                System.out.println(y + "/04/19");
            }
            else{
                System.out.println(String.valueOf(y) + "/0" + String.valueOf(month) + "/" + day);
            }
      }
      }
    }
}