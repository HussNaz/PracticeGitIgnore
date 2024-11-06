import java.util.Scanner;

public class Helper {

    private static final Scanner sc = new Scanner(System.in);

    public  static  String getInput(String prompt) {
    System.out.println(prompt);
    return sc.nextLine();
    }

    public static int getInteger(String prompt) {
        System.out.println(prompt);
        return sc.nextInt();
    }

    public static void closeScanner() {
        sc.close();
    }
}
