package mu.bigorno.utils;

import lombok.experimental.UtilityClass;

import static mu.bigorno.utils.Measurement.SCALE;

@UtilityClass
public class Dialogue {
    public static final int QUESTION = 0;
    public static final int EXCLAMATION = 1;

    public static final int DIALOGUE_WIDTH = (int) (14 * SCALE);
    public static final int DIALOGUE_HEIGHT = (int) (12 * SCALE);

    public static int getSpriteAmount(int type) {
        return switch (type) {
            case QUESTION, EXCLAMATION -> 5;
            default -> 0;
        };
    }
}
