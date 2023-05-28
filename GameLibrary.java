import java.util.HashMap;
import java.util.Map;

public class GameLibrary {
    private final Map<String, Game> games = new HashMap<>();

    public void add(Game game) {
        games.put(game.title(), game);
    }

    public void openGame(String title) {
        if (games.containsKey(title)) games.get(title).display();
        else System.out.println("Game not found");
    }
}
