import java.util.ArrayList;

public class Asn5 {

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<String>();
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // Add 4 items to each list
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Display original lists
        System.out.println("Fruits:");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println();

        System.out.println("Numbers:");

        for (Integer number : numbers) {
            System.out.println(number);
        }

        // Additional methods
        fruits.remove("Banana");
        numbers.add(50);

        // Display updated lists
        System.out.println("\nUpdated Fruits:");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println();

        System.out.println("Updated Numbers:");

        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}