import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Player playerA = new Player(Type.PAPER);
        Player playerB = new Player(Arrays.asList(Type.PAPER, Type.ROCK, Type.SCISSORS));

        Game.getInstance().play(playerA, playerB);
    }


}
