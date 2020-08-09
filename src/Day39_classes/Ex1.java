package Day39_classes;


public class Ex1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.model = "Corolla";
        car1.year = 2020;
        car1.mileage = 1000;

        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.mileage);
        System.out.println("=============");


        Car car2 = new Car();
        car2.brand = "Mazda";
        car2.model = "X3";
        car2.year = 2020;
        car2.mileage = 200;


        System.out.println(car2.brand);
        System.out.println(car2.model);
        System.out.println(car2.year);
        System.out.println(car2.mileage);


    }

}
