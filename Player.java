class Player {
    private String name;
    private int currentPosition;

    public Player(String name) {
        this.name = name;
        this.currentPosition = 0;
    }

    public String getName() {
        return name;
    }

    public void move(int position) {
        currentPosition = position;
    }

    public boolean isWon() {
        return currentPosition >= 100;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }
}