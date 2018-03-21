public class Game {

    private static Game instance = null;

    private Game() {
    }

    public static Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }

    public void play(Player playerA, Player playerB) {
        int winCountPlayerA = 0, drawCount = 0;
        Type currentTypeA, currentTypeB;
        for (int i = 0; i < 100; i++) {
            currentTypeA = playerA.getCurrentType();
            currentTypeB = playerB.getCurrentType();
            if (currentTypeA.equals(currentTypeB)) {
                drawCount++;
            } else if (currentTypeA.beats(currentTypeB)) {
                winCountPlayerA++;
            }
        }

        System.out.println("Player A wins " + winCountPlayerA + " of 100 games");
        System.out.println("Player B wins " + (100 - winCountPlayerA - drawCount) + " of 100 games");
        System.out.println("Tie: " + drawCount + " of 100 games");
    }
}
