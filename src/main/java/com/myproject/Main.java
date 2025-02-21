package com.myproject;
import com.myproject.Calculator;
import java.util.Scanner;

public class Main {
  public static void main (String[]args){
      Scanner scanner = new Scanner(System.in);
      System.out.println("Welcome to the calculator:");
      System.out.println("Enter a command (e.g., add 1 3, subtract 5 2, multiply 3 5, divide 10 2, fibonacci 7, binary 8)");
      System.out.println("Type 'exit' to quit.");

      while (true) {
        System.out.print("> ");
        String input = scanner.nextLine();
        if (input.trim().equalsIgnoreCase("exit")) {
          System.out.println("Goodbye!");
          break;
        }

        String[] tokens = input.split("\\s+");
        if (tokens.length == 0) {
          continue;
        }
        String command = tokens[0].toLowerCase();
        Calculator calc = new Calculator();

        try {
          switch (command) {
            case "add":
              // Expected format: add <int> <int>
              int addA = Integer.parseInt(tokens[1]);
              int addB = Integer.parseInt(tokens[2]);
              System.out.println(calc.add(addA, addB));
              break;
            case "subtract":
              // Expected format: subtract <int> <int>
              int subA = Integer.parseInt(tokens[1]);
              int subB = Integer.parseInt(tokens[2]);
              System.out.println(calc.subtract(subA, subB));
              break;
            case "multiply":
              // Expected format: multiply <int> <int>
              int mulA = Integer.parseInt(tokens[1]);
              int mulB = Integer.parseInt(tokens[2]);
              System.out.println(calc.multiply(mulA, mulB));
              break;
            case "divide":
              // Expected format: divide <int> <int>
              int divA = Integer.parseInt(tokens[1]);
              int divB = Integer.parseInt(tokens[2]);
              System.out.println(calc.divide(divA, divB));
              break;
            case "fibonacci":
              // Expected format: fibonacci <int>
              int n = Integer.parseInt(tokens[1]);
              System.out.println(calc.fibonacciNumberFinder(n));
              break;
            case "binary":
              // Expected format: binary <int>
              int number = Integer.parseInt(tokens[1]);
              System.out.println(calc.intToBinaryNumber(number));
              break;
            default:
              System.out.println("Unknown command: " + command);
              break;
          }
        } catch (Exception e) {
          System.out.println("Error processing command: " + e.getMessage());
        }

      }
      scanner.close();

  }
}
