package SYP;

/**
 * Created by maxim-mac on 18/03/2017.
 */

//Опасный код, выбрасывающий исключение

/*public class EXCEPTIONS {
    private boolean abandonAllHope;

    public void takeRisk() throws BadException {

        if (abandonAllHope) {
            throw new BadException();
        }
    }

    private class BadException extends Exception {
    }
*/

//Ваш код, который вызывает опасный метод

/*  public void crossFingers() {
        try {
            anObject.takeRisk();
        }catch (BadException ex) {
            System.out.println("Ахх!");
            ex.printStacktrace();
        }
    }
}
*/