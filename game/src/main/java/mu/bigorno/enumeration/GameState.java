package mu.bigorno.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GameState {
    PLAYING("playing"),
    MENU("menu"),
    OPTIONS("options"),
    QUIT("quit"),
    CREDITS("credits"),
    PLAYER_SELECTION("playerSelection");

    private final String name;

    public static GameState getState() {
        return MENU;
    }

}
