package md.cibric.java_core1.lesson6;

public class Animals {

    private static int counter;
    private String type;
    private String name;
    private int runDistance;
    private int swimDistance;

    private Animals() {
        counter++;
    }

    public Animals(String type, String name, int maximRun, int maximSwim) {
        this();
        this.type = type;
        this.name = name;
        this.runDistance = maximRun;
        this.swimDistance = maximSwim;
    }

    public boolean run(int distance) {
        if (distance <= runDistance) {
            System.out.printf("%s %s бегает %d метров\r\n", type, name, distance);
            return true;
        } else System.out.printf("%s %s не умеет бегать %d метров\r\n", type, name, distance);
        return false;
    }

    public boolean swim(int distance) {
        if (distance <= swimDistance) {
            System.out.printf("%s %s плавает %d метров\r\n", type, name, distance);
            return true;
        } else System.out.printf("%s %s не умеет плавать %d метров\r\n", type, name, distance);
        return false;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCounter() {
        return counter;
    }

}

