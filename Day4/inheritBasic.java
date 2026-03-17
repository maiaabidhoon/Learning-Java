package Day4;

class Car{
    public void Honda(){
        System.out.println("Honda car is started");
    }
}

public class inheritBasic extends Car {
    public static void main(String[] args){
        Car car = new Car();

        car.Honda();
    }
}
