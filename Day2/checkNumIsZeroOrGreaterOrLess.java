package Day2;
import java.util.Scanner;

public class checkNumIsZeroOrGreaterOrLess {
    public static void main(String[] args) {
        int num;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = sc.nextInt();

        if(num > 0){
            System.out.println("The number is greater than zero");
        } else if(num < 0){
            System.out.println("The number is less than zero");
        } else {
            System.out.println("The number is zero");
        }

        sc.close();
    }
    
}
