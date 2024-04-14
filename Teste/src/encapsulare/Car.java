package encapsulare;

public class Car {
    private String make;
    private String model;
    private int year;

    Car(String make,String model,int year){
        //this.make = make;
        this.setMake(make);
        //this.model=model;
        this.setModel(model);
        //this.year=year;
        this.setYear(year);


    }

    //getteri
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
    //setteri
    public void setMake(String make){
        this.make=make; //acum ca avem un setter,nu mai e necesar sa avem sus this.make ul si putem sa l schimbam cu setMake
    }
    public void setModel(String model){
        this.model=model;
    }
    public void setYear(int year){
        this.year=year;
    }




}
