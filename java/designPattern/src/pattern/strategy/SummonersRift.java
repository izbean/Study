package pattern.strategy;

public class SummonersRift implements GameMode {
    private String gameModeName = "소환사의 협곡";

    @Override
    public String getGameModeName() {
        return gameModeName;
    }
}
