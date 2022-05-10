import java.util.Random;

public class Pilot {
    boolean disease;
    int age;

    public Pilot() {
        double fate = Math.random() * 100;
        this.disease = fate > 90;
        this.age = (int)  (Math.random() * (51 - 25)) + 25;
    }

}
