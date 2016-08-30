package ball.model;

import ball.Ball;

import java.awt.*;

public class BallImpl implements Ball {
    protected int x;
    protected int y;
    private int direction;
    private final Behaviour[] behaviours;
    protected int radius;


    protected BallImpl(int centerX, int centerY, int defaultRadius, int direction, Behaviour... behaviours) {
        x = centerX;
        y = centerY;
        radius = defaultRadius;
        this.direction = direction;
        this.behaviours = behaviours;
    }

    // DO NOT CHANGE
    @Override
    public int radius() {
        return radius;
    }

    // DO NOT CHANGE
    @Override
    public Point center() {
        return new Point(x, y);
    }

    @Override
    public void update() {
        for(Behaviour behaviour: behaviours){
            behaviour.update(this);
        }
    }

    public int direction() {
        return direction;
    }
}
