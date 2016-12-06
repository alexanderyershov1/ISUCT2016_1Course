/**
 * Created by stud_6 on 17.10.16.
 */

import java.awt.*;

/**
 * Created by stud_6 on 17.10.16.
 */

public class Car extends Tech{
    private String brand;
    private String model;
    private int horsepower;

    private String color;
    private String shade;


    void Starter(){
        System.out.println("Engine start");
    }

    boolean isOil(){
        System.out.println("Oil is OK");
        return true;
    }

    boolean isPressure(){
        System.out.println("Pressure is OK\r\n");
        return true;
    }

    public String getColor() {
        return color;
    }
    public String getShade() {
        return shade;
    }

    public Car(){
        setColor("Red");
        setShade("Crimson");
    }
    public Car(String Col, String Shd ){
        setColor(Col);
        setShade(Shd);
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

    @Override
    public int getNumOfWheels() {
        return 0;
    }

    @Override
    public void setNumOfWheels(int NumberOfWheels) {}

    @Override
    public String toString(){
        return "Color:"+this.getColor()+ "Shade:"+this.getShade();
    }



}




/*
public class Car {
    private String brand;
    private String model;
    private int horsepower;


    void Starter(){
        System.out.println("Engine start");
    }

    void isOil(){
        System.out.println("Oil is OK");
    }

    void isPressure(){
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

*/
