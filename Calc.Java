import java.util.Scanner;

public class Calc {

    private double num1;
    private double num2;

    // Constructor: asks user for two numbers
    public Calc() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        num1 = sc.nextDouble();

        System.out.print("Please enter the second number: ");
        num2 = sc.nextDouble();
    }

    // Getters
    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    // Arithmetic methods
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

    // toString
    public String toString() {
        String info = "";
        info += "Displaying private data fields using toString():\n";
        info += "Num1: " + num1 + "\n";
        info += "Num2: " + num2 + "\n";
        return info;
    }
}
