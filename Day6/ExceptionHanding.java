package Day6;

public class ExceptionHanding {
    public static void main(String[] args){
        try {
            int a = 5;
            System.out.println(a + "Aabid");
        } catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}
