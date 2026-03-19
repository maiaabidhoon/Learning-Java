package Day0;

import java.util.Scanner;

public class printNameAgeCityAdv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Created an Object of Scanner class
        System.out.print("Enter your Name - ");
        String name = sc.nextLine(); // Store Input
        System.out.print("Enter your City - ");
        String city = sc.nextLine(); // Store Input
        System.out.print("Enter your Age - ");
        int age = sc.nextInt(); // Store Input

        System.out.print("[");
        for (int i = 1; i <= (city.length() < name.length() ? name.length() : city.length()) + 9; i++) { // Use for seprate , Table like structure
            System.out.print("~");
        }
        System.out.println(); // For starting print to next
        System.out.println("| Name : " + name);
        System.out.println("| Age : " + age);
        System.out.println("| City : " + city);
        System.out.print("[");
        for (int i = 1; i <= (city.length() < name.length() ? name.length() : city.length()) + 9; i++) { // Use for seprate , Table like structure
            System.out.print("~");
        }
        sc.close(); // Use for prevent memory leaks
    }
}
