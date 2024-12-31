package mu.bigorno.utils;

import lombok.experimental.UtilityClass;
import mu.bigorno.exception.ImageNotFoundException;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

@UtilityClass
public class ReadFile {

    public static BufferedImage processImage(String path) {
        try {
            return ImageIO.read(new File(path));
        } catch (IOException e) {
            throw new ImageNotFoundException("Image Not Found");
        }
    }
}
