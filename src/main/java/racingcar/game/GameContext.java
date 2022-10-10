package racingcar.game;

import racingcar.game.dto.GameStatus;
import racingcar.game.process.CarsInitialization;
import racingcar.io.Output;

public class GameContext {

    private GameStatus gameStatus;

    public void start() {
        this.gameStatus = new GameStatus(new CarsInitialization(), null);

        while (this.gameStatus.getGameProcess() != null) {
            execute();
        }
    }

    private void execute() {
        try {
            this.gameStatus = this.gameStatus.getGameProcess().execute(this.gameStatus);
        } catch (IllegalArgumentException e) {
            Output.error(e.getMessage());
        }
    }
}
