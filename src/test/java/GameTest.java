import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class GameTest {

    private Player playerA;
    private Player playerB;

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(System.out);
    }

    @Test
    public void testPlayerAAlwaysRockPlayerBAlwaysPaper() {
        playerA = new Player(Type.ROCK);
        playerB = new Player(Type.PAPER);
        Game.getInstance().play(playerA, playerB);
        String expected = "Player A wins 0 of 100 games\r\n" +
                "Player B wins 100 of 100 games\r\n" +
                "Tie: 0 of 100 games\r\n";
        assertEquals(expected, outContent.toString());
    }

    @Test
    public void testPlayerAAlwaysScissorsPlayerBAlwaysPaper() {
        playerA = new Player(Type.SCISSORS);
        playerB = new Player(Type.PAPER);
        Game.getInstance().play(playerA, playerB);
        String expected = "Player A wins 100 of 100 games\r\n" +
                "Player B wins 0 of 100 games\r\n" +
                "Tie: 0 of 100 games\r\n";
        assertEquals(expected, outContent.toString());
    }

    @Test
    public void testPlayerAAlwaysPaperPlayerBAlwaysPaper() {
        playerA = new Player(Type.PAPER);
        playerB = new Player(Type.PAPER);
        Game.getInstance().play(playerA, playerB);
        String expected = "Player A wins 0 of 100 games\r\n" +
                "Player B wins 0 of 100 games\r\n" +
                "Tie: 100 of 100 games\r\n";
        assertEquals(expected, outContent.toString());
    }
}
