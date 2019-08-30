package java.lang;

public class Test {

    public static void main(String[] arguments){
        try {
            new Object().finalize();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
