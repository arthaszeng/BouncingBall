package ball.model;

import ball.Ball;

public class BallFactory {

    public static Ball[] all() {
        return new Ball[]{
                bouncingBall(75, 50, Bouncing.DOWN),
                elasticBall(250, 100, Ball.DEFAULT_RADIUS, Elastic.SHRINK),
        };
    }

    public static Ball bouncingBall(int centerX, int centerY, int direction) {
        return new BallImpl(centerX, centerY, Ball.DEFAULT_RADIUS, direction,new Bouncing());
    }

    public static Ball elasticBall(int centerX, int centerY, int radius, int direction) {
        return new BallImpl(centerX, centerY, radius, direction,new Elastic());
    }

}
