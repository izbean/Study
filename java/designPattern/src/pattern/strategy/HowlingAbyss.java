package pattern.strategy;

public class HowlingAbyss implements GameMode {

    private String gameModeName = "칼바람 나락";

    @Override
    public String getGameModeName() {
        return gameModeName;
    }

}
