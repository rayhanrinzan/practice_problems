import java.util.Scanner;
public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a quote:");
        String str = input.nextLine();
        System.out.println("Enter the author of the quote:");
        String a = input.nextLine();
        System.out.println("\"" + str + "\"");
        System.out.println(a);
    }
}