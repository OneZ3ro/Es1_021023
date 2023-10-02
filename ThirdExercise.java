import java.util.Scanner;

public class ThirdExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------- Exercise 1 ---------------");
        System.out.println("--> Program to calculate the perimeter of a rectangle");
        System.out.println("· Write your width");
        double width = Double.parseDouble(input.nextLine());
        System.out.println("· Write your height");
        double height = Double.parseDouble(input.nextLine());
        double result1 = rectanglePerimeter(width, height);
        System.out.println("Result: " + result1);

        System.out.println("--------------- Exercise 2 ---------------");
        System.out.println("--> Program return 0 (EVEN) else 1 (ODD)");
        System.out.println("· Write your number");
        int num1 = Integer.parseInt(input.nextLine());
        int result2 = evenOrOdd(num1);
        System.out.println("Result: " + result2 + (result2 == 0 ? " (EVEN)" : " (ODD)"));
        input.close();

    }
    public static double rectanglePerimeter(double width, double height){
        return width * height;
    }
    public static int evenOrOdd(int num){
        if(num % 2 == 0) {
            return 0;
        } else {
            return 1;
        }
    }
}
