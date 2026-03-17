import java.util.Scanner;

public class CheckString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if (str == null || str.isEmpty())
            System.out.println("Empty");
        else
            System.out.println("Not Empty");

        sc.close();
    }
}