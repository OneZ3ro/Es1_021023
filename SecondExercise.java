import java.util.Scanner;

public class SecondExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------- Exercise ---------------");
        System.out.println("Write you first string");
        String str1 = input.nextLine();
        System.out.println("Write you second string");
        String str2 = input.nextLine();
        System.out.println("Write you third string");
        String str3 = input.nextLine();
        arrStr(str1, str2, str3);
        arrStrRev(str1, str2, str3);
    }
    public static void arrStr(String str1, String str2, String str3) {
        System.out.println("Concat of your strings: " + (str1 + str2 + str3));
        System.out.println("Concat of your strings (with spaces): " + str1 + " " + str2 + " " + str3);
    }
    public static void arrStrRev(String str1, String str2, String str3) {
        System.out.println("Concat of your strings reversed: " + (str3 + str2 + str1));
        System.out.println("Concat of your strings reversed (with spaces): " + str3 + " " + str2 + " " + str1);
    }
}