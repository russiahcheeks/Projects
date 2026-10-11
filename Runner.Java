import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        // First Pet: default constructor
        Pet p1 = new Pet();
        System.out.println(p1.toString());

        // Second Pet: custom constructor
        Pet p2 = new Pet("Buster", "Dog", 11);
        System.out.println(p2.toString());

        // Third Pet: user input
        System.out.println("Enter animal type:");
        String userType = scnr.nextLine();

        System.out.println("Enter animal name:");
        String userName = scnr.nextLine();

        System.out.println("Enter animal age:");
        int userAge = scnr.nextInt();

        Pet p3 = new Pet(userName, userType, userAge);
        System.out.println(p3.toString());
    }
}
