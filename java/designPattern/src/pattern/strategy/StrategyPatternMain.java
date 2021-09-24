package pattern.strategy;

public class StrategyPatternMain {
    public static void main(String[] args) {
        Game game = new Game();
        game.setGameMode(new SummonersRift());

        game.start();

        game.setGameMode(new HowlingAbyss());

        game.changeGameMode(new HowlingAbyss());
        game.start();



    }
}
