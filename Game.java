public record Game(String title) {
    public Game(String title) {
        this.title = title;
        start();
    }

    public void display() {
        System.out.println("Displaying : " + this.title);
    }

    private void start() {
        System.out.println("Starting: " + title);
    }
}
