package md.cibric.java_core1.lesson6;

public class Dogs extends Animals {

    private static int counter;

    Dogs(String name, int maximRun, int maximSwim) {
        super("Dog", name, maximRun, maximSwim);
        counter++;
    }

    public static int getCounter() {
        return counter;
    }
}