import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PracticeGitIgnore {
    public static void main(String[] args) {
        System.out.println("Here will be my code");

        String name = Helper.getInput("Please enter your name: ");
        int age = Helper.getInteger("Please enter your age: ");

        System.out.println("Hello " + name + ", you are " + age + " years old.");

        Helper.closeScanner();

    }
}
