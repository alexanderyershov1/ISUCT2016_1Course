package SYP;

/**
 * Created by maxim-mac on 08/03/2017.
 */
public class Static_var {

    private int size;
    private static int duckCount = 0;

    public Static_var() {
        duckCount++;
    }

    public void setSize(int s){
        size = s;
    }

    public int getSize(){
        return size;
    }


    public static void main(String[] args) {
        Static_var Duck = new Static_var();
        Duck.setSize(12);
        int duckCountMain = Static_var.duckCount;
        System.out.println("Q " + duckCountMain + " Size " + Duck.getSize());
    }
}
