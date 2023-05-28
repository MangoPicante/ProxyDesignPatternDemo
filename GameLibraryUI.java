public class GameLibraryUI {
    public static void main(String[] args) {
        String[] gameNames = {"Zelda", "Portal", "Hades"};
        GameLibrary lib = new GameLibrary();

        for (String gameName : gameNames)
            lib.add(new ProxyGame((gameName)));

        lib.openGame("Zelda");
    }
}
