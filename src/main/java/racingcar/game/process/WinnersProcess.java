package racingcar.game.process;

import static racingcar.constants.Message.WINNERS_RESULT_PATTERN;

import racingcar.game.dto.GameStatus;
import racingcar.io.Output;

public class WinnersProcess implements GameProcess {

    @Override
    public GameStatus execute(GameStatus gameStatus) {
        String winnersName = String.join(", ", gameStatus.getCars().getWinners().getWinnersName());

        Output.line();
        Output.println(String.format(WINNERS_RESULT_PATTERN, winnersName));

        return new GameStatus(null, null, 0);
    }
}
