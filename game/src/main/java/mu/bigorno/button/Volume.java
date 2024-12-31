package mu.bigorno.button;

import lombok.Getter;
import lombok.Setter;
import mu.bigorno.utils.ReadFile;

import java.awt.image.BufferedImage;
import java.util.stream.IntStream;

import static mu.bigorno.enumeration.Path.VOLUME_BUTTONS;

@Getter
@Setter
public class Volume extends Pause {

    private BufferedImage[] images;
    private BufferedImage slider;

    public Volume(int x, int y, int height, int width) {
        super(x, y, height, width);
        loadImages();
    }

    private void loadImages() {
        BufferedImage image = ReadFile.processImage(VOLUME_BUTTONS.getPath());
    }
}
