/**
 * Created by stud_6 on 17.10.16.
 */
public class Phone  {
    private int brand;
    private String model;
    private String size;

//    @Override
    public void call() {
        System.out.println("Dzin");
    }

    public int getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getSize() {
        return size;
    }

    public void setBrand(int brand) {

        brand = brand;
    }

    public void setSize(String size) {
        this.size = size;
    }

//    @Override
//    void restart() {
//
//    }
//    @Override
//    void write() {
//        System.out.println("sms");
//    }

    void v() {
        System.out.println(brand);}

    public void setModel(String model) {
        this.model = model;
    }



}