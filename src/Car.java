/**
 * Created by stud_6 on 17.10.16.
 */

public class Car {
    private String brand;
    private String model;
    private int horsepower;


    void Starter(){
        System.out.println("Engine start");
    }

    void CheckOil(){
        System.out.println("Oil is OK");
    }

    void CheckPressure(){
        System.out.println("Pressure is OK\r\n");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

}


