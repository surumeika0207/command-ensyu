import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double height = scanner.nextDouble();
        double weight = scanner.nextDouble();
        double BMI = weight / (height * height);
        String surume = String.format("%.2f", BMI);
        System.out.println(surume);
    }
}