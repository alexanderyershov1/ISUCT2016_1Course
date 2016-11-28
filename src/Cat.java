/**
 * Created by stud_6 on 17.10.16.
 */
public class Cat extends Felidae{
    private int Age;
    private String name;
    private String color;
    @Override
    void talk() {
        System.out.println("May");
    }

    public int getAge() {
        return Age;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setAge(int age) {

        Age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    void eat() {

    }

    @Override
    void go() {
        System.out.println("Prisla");
    }

    void V() {
        System.out.println(Age);}

    public void setName(String name) {
        this.name = name;
    }



}