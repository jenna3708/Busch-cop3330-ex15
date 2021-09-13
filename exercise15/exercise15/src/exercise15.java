import java.util.Scanner;

public class exercise15 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is the password?");
        String password = input.next();

        String correctPass = "abc$123";

        if (password.equals(correctPass))
        {
            System.out.println("Welcome!");
        }
        else
        {
            System.out.println("I don't know you.");
        }

    }
}
