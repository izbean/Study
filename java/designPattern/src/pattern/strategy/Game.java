package pattern.strategy;

public class Game {

    private GameMode gameMode;

    public void setGameMode(GameMode gameMode) {
        if (this.gameMode != null)
            System.out.println("[-]이미 게임 모드가 설정 되었습니다. \n설정된 게임 명: " + this.gameMode.getGameModeName());
        else
            this.gameMode = gameMode;
            System.out.println("[-]게임 모드 설정 완료.\n설정된 게임 명: " + gameMode.getGameModeName());
    }

    public void changeGameMode(GameMode gameMode) {
        if (gameMode != null && this.gameMode != null) {
            this.gameMode = gameMode;
            System.out.println("[-]게임 모드 변경 완료");
            System.out.println(String.format("[-]변경 된 게임 모드: %s", gameMode.getGameModeName()));
        } else {
            System.out.println("[-]변경 할 게임 모드가 입력되지 않았거나, 대기중인 게임 모드가 없습니다.");
        }
    }

    public void start() {
        if (gameMode == null)
            System.out.println("게임 모드가 설정 되어 있지 않습니다.");
        else
            gameMode.start();
    }
}
