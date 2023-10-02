import java.util.Scanner;

public class FirstExercise {
    public static void main(String[] args) {
        System.out.println("--------------- Exercise 1 ---------------");
        multiplication();
        System.out.println("-------------------------------------------");


    }

    public static void multiplication() {
        Scanner input = new Scanner(System.in);
        System.out.println("--> Program to multiply two numbers");
        System.out.println("· Write your first number");
        int num1 = input.nextInt();
        System.out.println("· Write your second number");
        int num2 = input.nextInt();
        input.close();
        System.out.println("Result: " + (num1 * num2));
    }
}
