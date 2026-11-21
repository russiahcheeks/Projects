import java.util.Scanner;

public class Calc {

    private double num1;
    private double num2;

    public Calc() {
        Scanner sc = new Scanner(System.in);

        // Input for num1
        System.out.print("Please enter the first number: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a numeric value.");
            sc.next(); // discard bad input
            System.out.print("Please enter the first number: ");
        }
        num1 = sc.nextDouble();

        // Input for num2
        System.out.print("Please enter the second number: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a numeric value.");
            sc.next(); // discard bad input
            System.out.print("Please enter the second number: ");
        }
        num2 = sc.nextDouble();
    }

    double num1;

while (true) {
    System.out.print("Enter first number: ");

    if (scnr.hasNextDouble()) {
        num1 = scnr.nextDouble();
        break;
    }

    System.out.println("Invalid input. Please enter a number.");
    scnr.next();
}

   double num2;

while (true) {
    System.out.print("Enter second number: ");

    if (scnr.hasNextDouble()) {
        num2 = scnr.nextDouble();
        break;
    }

    System.out.println("Invalid input. Please enter a number.");
    scnr.next();
}
    public double sum() {
        return num1 + num2;
    }

    public double difference() {
        return num1 - num2;
    }

    public double product() {
        return num1 * num2;
    }

    public double quotient() {
        return num1 / num2;
    }

    public String toString() {
        String info = "";
        info += "Displaying private data fields using toString():\n";
        info += "Num1: " + num1 + "\n";
        info += "Num2: " + num2 + "\n";
        return info;
    }
}
