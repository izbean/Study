package pattern.strategy;

public class SummonersRift implements GameMode {
    private final String gameModeName = "소환사의 협곡";

    @Override
    public String getGameModeName() {
        return gameModeName;
    }

    @Override
    public void start() {
        System.out.println(gameModeName + " 게임을 시작 합니다.");
    }

}
