import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.*;
import java.text.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
        int numVar = input.nextInt();
        int numLines = input.nextInt();
        input.nextLine();
        HashMap<String, String> phonebook = new HashMap<String, String>();

        for(int i = 0; i < numVar; i++){
            String line = input.nextLine();
            String field = "[" + line.substring(0, line.indexOf(":")) + "]";
            String temp = line.substring(line.indexOf(":") + 2);
            phonebook.put(field, temp);
        }
        
        for (int i = 0; i < numLines; i++) {
    Pattern p = Pattern.compile("\\[(.*?)\\]");
    Matcher m = p.matcher(input.nextLine());
    StringBuffer replacedLine = new StringBuffer();

    while (m.find()) {
        String key = m.group(); 
        String replacement = phonebook.get(key);

        if (replacement != null) {
            m.appendReplacement(replacedLine, replacement);
        } else {
            m.appendReplacement(replacedLine, m.group());
        }
    }

    m.appendTail(replacedLine);

    System.out.println(replacedLine.toString());
}


        
        }
        


          
          
      
      }
    }
}