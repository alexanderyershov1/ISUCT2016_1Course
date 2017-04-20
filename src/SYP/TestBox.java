package SYP;

/**
 * Created by maxim-mac on 08/03/2017.
 */
public class TestBox {
    Integer i;
    int j;

    public static void main (String[] args) {
        TestBox t = new TestBox();
        t.go();
    }

    public void go(){
        j=i;
        System.out.println(i);
        System.out.println(j);
    }
}

/*
Exception in thread "main" java.lang.NullPointerException
	at SYP.TestBox.go(TestBox.java:16)
	at SYP.TestBox.main(TestBox.java:12)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:606)
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)
 */