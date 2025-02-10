
import java.util.*;

class Game {
    private List<Player> players;
    private Board board;
    private Dice dice;
    private int currentTurn;
    private boolean isGameOver;

    public Game(List<Player> players, Board board, Dice dice) {
        this.players = players;
        this.board = board;
        this.dice = dice;
        this.currentTurn = 0;
        this.isGameOver = false;
    }

    public void startGame() {
        while (!isGameOver) {
            nextTurn();
        }
    }

    public void nextTurn() {
        Player currentPlayer = players.get(currentTurn % players.size());
        int result = dice.roll();
        int lastPosition = currentPlayer.getCurrentPosition();
        int newPosition = lastPosition + result;

        if(newPosition > 100) {
            System.out.println(currentPlayer.getName() + " Can't move beyond 100. Stay on " + lastPosition);
        } else {
            currentPlayer.move(board.getNextPosition(newPosition));
            System.out.println(currentPlayer.getName() + " rolled a " + result + " and moved from " + lastPosition + " to " + currentPlayer.getCurrentPosition());
        }

        if (currentPlayer.isWon()) {
            isGameOver = true;
            System.out.println(currentPlayer.getName() + " wins the game");
        }
        currentTurn++;
    }
}
