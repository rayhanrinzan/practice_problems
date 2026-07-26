import java.util.*;

public class MyProgram {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int testCases = Integer.parseInt(input.nextLine());
            for (int c = 0; c < testCases; c++) {
                int n1 = input.nextInt();
                int n2 = input.nextInt();
                int target = input.nextInt();
                input.nextLine();
                ArrayList<Integer> arrList = new ArrayList<Integer>();

                for (int i = 0; i < n1; i++) {
                    arrList.add(1);
                }
                for (int i = 0; i < n2; i++) {
                    arrList.add(5);
                }
                if (!add(arrList, new ArrayList<Integer>(), target)) {
                    System.out.println("false");
                }
            }
        }
    }

    public static boolean add(List<Integer> digits, List<Integer> workingList, int t) {
        for (int i = 0; i < digits.size(); i++) {
            List<Integer> list = new ArrayList<>(workingList);
            list.add(digits.get(i));

            if (add(digits.subList(i + 1, digits.size()), list, t)) {
                return true; 
            }
        }

        int sum = 0;
        for (int element : workingList) {
            sum += element;
        }

        if (sum == t) {
            System.out.println("true");
            return true;
        }

        return false;
    }
}