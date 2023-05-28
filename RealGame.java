public record RealGame(String title) implements Game {
    public RealGame(String title) {
        this.title = title;
        start();
    }

    @Override
    public void display() {
        System.out.println("Displaying : " + this.title);
    }

    private void start() {
        System.out.println("Starting: " + title);
    }
}
