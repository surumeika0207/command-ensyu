import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double height1 = scanner.nextDouble();
        double weight1 = scanner.nextDouble();
        double BMI1 = weight1 / (height1 * height1);

        String surume1 = String.format("%.2f", BMI1);
        System.out.println(surume1);
        double height2 = scanner.nextDouble();
        double weight2 = scanner.nextDouble();
        double BMI2 = weight2 / (height2 * height2);
        String surume2 = String.format("%.2f", BMI2);
        System.out.println(surume2);
    }
}