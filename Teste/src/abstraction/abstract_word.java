package abstraction;

public class abstract_word {

    public static void main(String[] args) {
//previne crearea unei instante prea abstracte,dar se poate prin subclasele ei
    //nu putem declara vehicul
       // Vehicle vehicle = new Vehicle();
        Car car = new Car();
        car.go();


    }
}
