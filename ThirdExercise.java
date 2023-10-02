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

        input.close();

    }
    public static double rectanglePerimeter(double width, double height){
        return width * height;
    }
}
