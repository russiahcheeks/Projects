import java.util.Scanner;
import java.text.DecimalFormat;

public class Tests {

    // private fields (from schema)
    private double average;
    private int count;

    // constructor
    public Tests() {
        average = 0.0;
        count = 0;
    }

    // custom method: getAverage() → void
    public void getAverage() {
        Scanner sc = new Scanner(System.in);

        double sum = 0;
        int scoreCount = 0;

        System.out.print("Enter test score (-1 to quit): ");
        int score = sc.nextInt();   // prime the loop

        while (score != -1) {
            sum += score;
            scoreCount++;

            System.out.print("Enter test score (-1 to quit): ");
            score = sc.nextInt();
        }

        // calculate average
        if (scoreCount > 0) {
            average = sum / scoreCount;
        } else {
            average = Double.NaN;   // matches assignment requirement
        }

        count = scoreCount;
    }

    // toString() formats average to 2 decimals
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "The average of the " + count + " scores entered is " + df.format(average);
    }
}
