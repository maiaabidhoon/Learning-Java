public class logicalOpe {
    public static void main(String[] args){
        // & , | , !

        int num1 = 5 , num2 = 4 , num3 = 6;

        if (num1 - num2 == 1 && num3 - num1 == 1){
            System.out.println("First True");
        }

        if (num2 * num3 <= num3 * num1 | num2 * num3 >= num3 * num1){
            System.out.println("Second True");
        }

    }
}
