package Day00;

import java.util.Scanner;

public class printNameAgeCityUsingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Created an Object of Scanner class
        System.out.print("Enter your Name - ");
        String name = sc.nextLine(); // Store Input
        System.out.print("Enter your City - ");
        String city = sc.nextLine(); // Store Input
        System.out.print("Enter your Age - ");
        int age = sc.nextInt(); // Store Input

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("City : " + city);
        sc.close(); // Use for prevent memory leaks
    }
}
