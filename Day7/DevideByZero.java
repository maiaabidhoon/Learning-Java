package Day7;

public class DevideByZero {
    public static void main(String[] args){
        try {
            int result = 10 / 0;
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
