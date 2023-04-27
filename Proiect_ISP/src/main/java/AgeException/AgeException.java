package AgeException;

import Login.Login;

import java.util.Scanner;

class AgeException1 extends Throwable {

    public AgeException1(String str) {
        System.out.println(str);
    }
}

public class AgeException {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("\nTo access PC Garage please introduce your age:\n");
        System.out.print("Enter your age : ");
        int age = s.nextInt();

        try {
            if (age < 16)
                throw new AgeException1("Your age is invalid");
            else {
                System.out.println("Proceed");
                new Login();
            }
        } catch (AgeException1 a) {
            System.out.println(a.getMessage());
        }
    }


}