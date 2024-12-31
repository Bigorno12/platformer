package mu.bigorno.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Path {
    
    VOLUME_BUTTONS("C:/Workspace/platformer/game/src/main/resources/pictures/volume_buttons.png");
    
    private final String path;
}
