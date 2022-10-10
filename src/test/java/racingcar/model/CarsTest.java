package racingcar.model;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import racingcar.strategy.AlwaysMove;

class CarsTest {

    @Test
    void 자동차_리스트_정상_생성() {
        List<String> names = generateNames();

        Cars cars = new Cars();
        cars.addCars(names, new AlwaysMove());

        assertThat(cars.getResults().size()).isEqualTo(3);
    }

    private List<String> generateNames() {
        List<String> names = new ArrayList<>();
        names.add("test1");
        names.add("test2");
        names.add("test3");
        return names;
    }
}