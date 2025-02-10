
import java.util.*;

class Board {
    private List<Snake> snakes;
    private List<Ladder> ladders;

    public Board() {
        this.snakes = new ArrayList<Snake>();
        this.ladders = new ArrayList<Ladder>();
    }

    public void addSnake(Snake snake) {
        snakes.add(snake);
    }

    public void addLadder(Ladder ladder) {
        ladders.add(ladder);
    }

    public int getNextPosition(int position) {
        for (Snake snake : snakes) {
            if (position == snake.getHead()) {
                return snake.getTail();
            }
        }
        for (Ladder ladder : ladders) {
            if (position == ladder.getBottom()) {
                return ladder.getTop();
            }
        }
        return position;
    }
}