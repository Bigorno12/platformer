package mu.bigorno.utils;

import lombok.experimental.UtilityClass;

import static mu.bigorno.utils.Measurement.SCALE;

@UtilityClass
public class Projectiles {

    public static final float SPEED = 0.75f * SCALE;

    public static final int CANNON_BALL_DEFAULT_WIDTH = 15;
    public static final int CANNON_BALL_DEFAULT_HEIGHT = 15;

    public static final int CANNON_BALL_WIDTH = (int) (SCALE * CANNON_BALL_DEFAULT_WIDTH);
    public static final int CANNON_BALL_HEIGHT = (int) (SCALE * CANNON_BALL_DEFAULT_HEIGHT);
}
