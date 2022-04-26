package md.cibric.java_core1.lesson6;

public class HomeWorkApp6 {

    public static void main(String[] args) {

        Animals[] animals = {
                new Cats("Sally"),
                new Cats("Felix"),
                new Dogs("Sam", 500, 20),
                new Dogs("Rocky", 1000, 15),
        };

        for (Animals a : animals) {
            a.run(200);
            a.swim(10);
            a.run(500);
            a.swim(15);
            a.run(1000);
            a.swim(30);
        }

        Animals[] loopAnimals = new Animals[10];
        for (int i = 0; i < loopAnimals.length; i++) {
            loopAnimals[i] = new Cats("Virus");
        }
    }
}
