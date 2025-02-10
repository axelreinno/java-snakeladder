
import java.util.*;

public class SnakeLadder {
    public static void main(String[] args) {
        Dice dice = new Dice(6);
        Board board = new Board();
        List<Player> players = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Snakes: ");
        int snakeTotal = scanner.nextInt();
        for (int i = 0; i < snakeTotal; i++) {
            int head = scanner.nextInt();
            int tail = scanner.nextInt();
            board.addSnake(new Snake(head, tail));
        }

        System.out.print("Ladders: ");
        int ladderTotal = scanner.nextInt();
        for (int i = 0; i < ladderTotal; i++) {
            int bottom = scanner.nextInt();
            int top = scanner.nextInt();
            board.addLadder(new Ladder(bottom, top));
        }

        System.out.print("Players: ");
        int playerTotal = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < playerTotal; i++) {
            String name = scanner.nextLine();
            players.add(new Player(name));
        }

        Game game = new Game(players, board, dice);
        game.startGame();
    }
}