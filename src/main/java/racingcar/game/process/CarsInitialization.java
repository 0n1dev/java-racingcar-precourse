package racingcar.game.process;

import static racingcar.constants.Message.INIT_CARS_NAME_MESSAGE;

import racingcar.game.dto.GameStatus;
import racingcar.io.Input;
import racingcar.io.Output;
import racingcar.model.Cars;
import racingcar.strategy.RandomMove;

public class CarsInitialization implements GameProcess {

    @Override
    public GameStatus execute(GameStatus gameStatus) {
        Output.println(INIT_CARS_NAME_MESSAGE);

        String inputNames = Input.readLine();
        String[] names = inputNames.split(",");
        Cars cars = Cars.of(names, new RandomMove());

        return new GameStatus(new CarsInitialization(), cars);
    }
}
