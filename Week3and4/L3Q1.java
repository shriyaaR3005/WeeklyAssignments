import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight in kg: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Invalid input for weight.");
            return;
        }
        double weight = scanner.nextDouble();
        System.out.print("Enter height in cm: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Invalid input for height.");
            return;
        }
        double heightCm = scanner.nextDouble();
        if (weight <= 0 || heightCm <= 0) {
            System.out.println("Weight and height must be positive values.");
            return;
        }
        double heightMeters = heightCm / 100;
        double bmi = weight / (heightMeters * heightMeters);
        System.out.printf("Your BMI is: %.2f\n", bmi);
        if (bmi < 18.5) {
            System.out.println("Weight Status: Underweight");
        } 
        else if (bmi <= 24.9) {
            System.out.println("Weight Status: Normal weight");
        } 
        else if (bmi <= 39.9) {
            System.out.println("Weight Status: Overweight");
        } 
        else {
            System.out.println("Weight Status: Obese");
        }
        scanner.close();
    }
}