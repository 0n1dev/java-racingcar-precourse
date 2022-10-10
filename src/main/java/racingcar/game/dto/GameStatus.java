package racingcar.game.dto;

import racingcar.game.process.GameProcess;
import racingcar.model.Cars;

public class GameStatus {

    private final GameProcess gameProcess;
    private final Cars cars;

    public GameStatus(GameProcess gameProcess, Cars cars) {
        this.gameProcess = gameProcess;
        this.cars = cars;
    }

    public GameProcess getGameProcess() {
        return gameProcess;
    }

    public Cars getCars() {
        return cars;
    }
}
