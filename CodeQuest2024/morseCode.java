import java.util.*;
import java.lang.*;
import java.text.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
        HashMap<String, String> morse = new HashMap<String, String>();
        HashMap<String, String> letter = new HashMap<String, String>();

        for(int i = 0; i < 26; i++){
            String temp = input.nextLine();
            morse.put(temp.substring(0, 1), temp.substring(2));
            letter.put(temp.substring(2), temp.substring(0, 1));
        }
        String encode = input.nextLine();
        String ans = "";
        for(int i = 0; i < encode.length(); i++){
            if(encode.substring(i, i+1).equals(" ")){
                ans += "       ";
            }
            else{
                ans += morse.get(encode.substring(i, i+1));
                if((i != encode.length()-1) && !(encode.substring(i+1, i+2).equals(" "))){
                    ans += "   ";
                }
            }
        }
        String decode = input.nextLine();
        String[] wordArr = decode.split("       ");
        String result = "";
        // for(int i = 0; i < wordArr.length; i++){
        //     System.out.println(wordArr[i]);
        // }
        for(int i = 0; i < wordArr.length; i++){
            String[] charArr = wordArr[i].split("   ");
            for(int x = 0; x < charArr.length; x++){
                result += letter.get(charArr[x]);
                //System.out.println(letter.get(charArr[x]));
            }
            if(i != wordArr.length-1){
                result += " ";
            }
        }
        System.out.println(ans);
        System.out.println(result);
          
          
      }
      }
    }
}