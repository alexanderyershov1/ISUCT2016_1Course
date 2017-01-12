package E;

/**
 * Created by Maxim on 12-Jan-17.
 */
public abstract class Animals_22 {
    String location;
    int boundaries;
    public void sleep(){
        System.out.println("Животное спит...");
    }
    public void roam(){
        System.out.println("Животное бродит...");
    }
    public abstract void makeNoise();
    public abstract void Eat();

}
