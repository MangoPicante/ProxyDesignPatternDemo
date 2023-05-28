public class ProxyGame implements Game {
    private final String title;
    Game game;

    public ProxyGame(String title) {
        this.title = title;
    }

    @Override
    public void display() {
        if (game == null) game = new RealGame(title);
        game.display();
    }

    @Override
    public String title() {
        return title;
    }
}
