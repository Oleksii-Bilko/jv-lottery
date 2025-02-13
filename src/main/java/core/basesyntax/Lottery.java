package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball randomBall = new Ball();
        randomBall.setNumber(new Random().nextInt(100));
        randomBall.setColor(new ColorSupplier().getRandomColor());
        return randomBall;
    }
}
