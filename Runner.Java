public class Runner {
    public static void main(String[] args) {

        // Instantiate Tests object
        Tests t = new Tests();

        // Call getAverage() to collect scores
        t.getAverage();

        // Print results
        System.out.println(t.toString());
    }
}
