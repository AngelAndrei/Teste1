package polymorphism;

public class polymorphism {
    public static void main(String[] args) {
        //abilitatea unui obiect de a se identifica in mai multe feluri

        Car car =new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Vehicle[] racers = {car,bicycle,boat};

        for(Vehicle x: racers ){
            x.go();

        }


    }


}
