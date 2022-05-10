import java.util.Random;

public class Pilot {
    boolean disease;
    int age;

    public Pilot() {
        double fate = Math.random() * 100;
        if (fate > 90) {
            this.disease = true;
        } else {
            this.disease = false;
        }
        this.age = (int)  (Math.random() * (52 - 25)) + 25;
    }

}
