import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PracticeGitIgnore {
    public static void main(String[] args) {
        System.out.println("Here will be my code");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter your name");
            String str = br.readLine();
            System.out.println("Enter your Project Name");
            String str2 = br.readLine();
            System.out.println(str+" "+str2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
