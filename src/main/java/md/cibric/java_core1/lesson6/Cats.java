package md.cibric.java_core1.lesson6;

public class Cats extends Animals {

    private static final int CAT_MAX_RUN = 200;
    private static int counter;

    public Cats(String name) {
        super("Cat", name, CAT_MAX_RUN, 0);
        counter++;
    }

    @Override
    public boolean swim(int distance) {
        System.out.println(getName() + " won't swim!");
        return false;
    }

    public static int getCounter() {
        return counter;
    }
}
