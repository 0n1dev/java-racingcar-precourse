package racingcar.model;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

class CarTest {

    @Test
    void 자동차_이름_길이_예외_처리() {
        assertThatThrownBy(() -> {
            new Car("test1234");
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 자동차_전진() {
        Car car = new Car("test");
        car.move(5);

        assertThat(car.getDistance()).isEqualTo(1);
    }

    @Test
    void 자동차_정지() {
        Car car = new Car("test");
        car.move(3);

        assertThat(car.getDistance()).isEqualTo(0);
    }
}