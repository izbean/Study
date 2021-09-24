package pattern.strategy;

public class HowlingAbyss implements GameMode {

    private final String gameModeName = "칼바람 나락";

    @Override
    public String getGameModeName() {
        return gameModeName;
    }

    @Override
    public void start() {
        System.out.println(gameModeName + " 게임을 시작 합니다.");
    }

}
