import java.util.*;
public class MyProgram {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int testCases = Integer.parseInt(input.nextLine());
            for(int c = 0; c < testCases; c++) {
                int n = Integer.parseInt(input.nextLine());
                String ans = "";
                for(int i = 0; i < n; i++){
                    String[] arr = input.nextLine().split("\\|");
                    ans += arr[0].charAt(Integer.valueOf(arr[1]));
                }
                System.out.println(ans);
            }
        }
    }
}