package basic.reference_types;

public class CarTest {
    public static void changeDoors(Car car, int d){
       car.doors = d;
    }

    public static void changeColors(Car car1, Car car2){
        String color = car1.color;
        car1.color = car2.color;
        car2.color=color;
    }

    public static void main(String[] args) {
        Car car1 = new Car("red", "V6", 5);
        Car car2 = new Car("black", "V8", 3);

        changeDoors(car1, 3);
        changeColors(car1, car2);

        System.out.println(car1.doors);
        System.out.println(car1.color);
        System.out.println(car2.color);

    }
}
