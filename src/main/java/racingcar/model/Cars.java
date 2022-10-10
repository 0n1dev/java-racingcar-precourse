package racingcar.model;

import java.util.ArrayList;
import java.util.List;
import racingcar.strategy.Move;

public class Cars {

    private final List<Car> cars;

    public Cars() {
        this.cars = new ArrayList<>();
    }

    public void addCars(final List<String> names, final Move move) {
        for (String name : names) {
            this.cars.add(new Car(name, move));
        }
    }

    public void move() {
        for (Car car : cars) {
            car.move();
        }
    }

    public List<Car> getResults() {
        return cars;
    }

    public Winners getWinners() {
        return Winners.of(this.cars);
    }
}
