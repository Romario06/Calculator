package org.example;

public class App {

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java -jar Calculator.jar <number1> <operation> <number2>");
            System.exit(1);
        }

        try {
            double num1 = Double.parseDouble(args[0]);
            String operation = args[1];
            double num2 = Double.parseDouble(args[2]);

            double result = 0;

            switch (operation) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "x":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero.");
                        System.exit(1);
                    }
                    break;
                default:
                    System.out.println("Invalid operation. Use +, -, x, or /.");
                    System.exit(1);
            }

            System.out.println("Result: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Invalid number format. Please provide valid numbers.");
            System.exit(1);
        }
    }
}