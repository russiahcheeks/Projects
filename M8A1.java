import java.io.*;
import java.text.DecimalFormat;

public class M8A1 {

    public static void main(String[] args) {

        String inputFile = "pay.csv";
        String outputFile = "output.csv";

        DecimalFormat money = new DecimalFormat("$#,##0.00");

        try {

            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));

            // Write headings
            bw.write("EmpID,PayRate,HoursWorked,WeeklyPay");
            bw.newLine();

            // Skip header row in pay.csv
            String line = br.readLine();

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                int empId = Integer.parseInt(data[0].trim());
                double payRate = Double.parseDouble(data[1].trim());
                double hoursWorked = Double.parseDouble(data[2].trim());

                double weeklyPay;

                if (hoursWorked <= 40) {
                    weeklyPay = payRate * hoursWorked;
                } else {
                    double overtimeHours = hoursWorked - 40;

                    weeklyPay =
                            (40 * payRate) +
                            (overtimeHours * payRate * 1.5);
                }

                String outputLine =
                        empId + "," +
                        payRate + "," +
                        hoursWorked + "," +
                        money.format(weeklyPay);

                bw.write(outputLine);
                bw.newLine();
            }

            br.close();
            bw.close();

            System.out.println("output.csv created successfully.");

        }
        catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}