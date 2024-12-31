package mu.bigorno.button;

import lombok.Getter;
import lombok.Setter;

import java.awt.*;

@Getter
@Setter
public class Pause {
    private int x;
    private int y;
    private int width;
    private int height;
    private Rectangle bound;

    public Pause(int x, int y, int height, int width) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
        this.bound = new Rectangle(x, y, width, height);
    }
}
