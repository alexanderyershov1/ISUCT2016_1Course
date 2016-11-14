package Dotfedot;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by stud_6 on 14.11.16.
 */
public class DotComTest {
    @Test
    public void checkYourself() throws Exception {
     DotCom dot = new DotCom();
        ArrayList <String> locTest = new ArrayList<String>();
        locTest.add ("1");
        locTest.add ("2");
        locTest.add ("3");
        String userInput = "2";
        dot.setLocationCells (locTest);
        String result= dot.checkYourself(userInput);


    }

}