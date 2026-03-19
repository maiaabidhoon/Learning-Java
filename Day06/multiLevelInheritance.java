package Day06;

class CarColor {
    void color() {
        System.out.println("Color is Red");
    }
}

class CarComp extends CarColor {
    void comp() {
        System.out.println("Company is BMW");
    }
}

class CarType extends CarComp {
    void type() {
        System.out.println("Car Type is EV");
    }
}

class Car extends CarType {
}

public class multiLevelInheritance {
    public static void main(String[] args) {
        Car car = new Car();

        car.color();
        car.comp();
        car.type();

    }
}
