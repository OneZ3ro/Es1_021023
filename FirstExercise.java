import java.util.Scanner;

public class FirstExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------- Exercise 1 ---------------");
        System.out.println("--> Program to multiply two numbers");
        System.out.println("· Write your first number");
        int num1 = Integer.parseInt(input.nextLine());
        System.out.println("· Write your second number");
        int num2 = Integer.parseInt(input.nextLine());
        int result1 = multiplication(num1, num2);
        System.out.println("Result: " + result1);
        System.out.println("--------------- Exercise 2 ---------------");
        System.out.println("--> Program to concat a string with a number");
        System.out.println("· Write your string");
        String str1 = input.nextLine();
        System.out.println("· Write your number");
        int num3 = Integer.parseInt(input.nextLine());
        String result2 = concatena(str1, num3);
        System.out.println("Result: " + result2);

        System.out.println("--------------- Exercise 3 ---------------");
        System.out.println("--> Program array");
        String[] arrStr = {"First elem", "Second elem", "Third elem", "Fourth elem", "Fifth elem"};
        System.out.println("Write a string");
        String str2 = input.nextLine();
        String[] result3 = arrMethod(arrStr, str2);
        System.out.println("Result 3: ");
        for (int i = 0; i < result3.length; i++) {
            System.out.println("pos-" + i + ": " + result3[i]);
        }
        System.out.println("-------------------------------------------");
        input.close();
    }

    public static int multiplication(int num1, int num2) {
        return num1 *  num2;
    }

    public static String concatena(String str1, int num1) {
        return str1  + num1;
    }

    public static String[] arrMethod (String[] strArr, String str1) {
        String[] result3 = new String[6];
        for (int i = 0; i < 3; i++) {
            result3[i] = strArr[i];
        }
        result3[3] = str1;
        result3[4] = strArr[3];
        result3[5] = strArr[4];
        return result3;
    }
}
