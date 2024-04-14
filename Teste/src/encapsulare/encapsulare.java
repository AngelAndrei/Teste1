package encapsulare;

public class encapsulare {

    public static void main(String[] args) {

        //encapsulare = atributele unei clase vor fi ori ascunse ori private
        //pot fi accesate doar cu getteri si setteri
        //ar trebui sa faci mereu atributele private daca n ai niciun motiv bun pentru a le face publice sau protejate

        Car car1=new Car("chevy","camaro",2021);
     //   System.out.println(car1.make);
        System.out.println(car1.getMake());

       // car1.year =2022;
        car1.setYear(2022);

    }
}
