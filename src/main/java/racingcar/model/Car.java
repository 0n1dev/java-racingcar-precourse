package racingcar.model;

import static racingcar.constants.Message.INVALID_CAR_NAME_PATTERN;

public class Car {

    private static final int MAX_NAME_LENGTH = 5;
    private static final int INIT_DISTANCE = 0;
    private static final int MOVE_BASE_NUMBER = 4;
    private final String name;
    private int distance;

    public Car(String name) {
        validate(name);
        this.name = name;
        this.distance = INIT_DISTANCE;
    }

    private void validate(final String name) {
        if (name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException(String.format(INVALID_CAR_NAME_PATTERN, MAX_NAME_LENGTH));
        }
    }

    public void move(final int randomValue) {
        if (randomValue >= MOVE_BASE_NUMBER) {
            this.distance++;
        }
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }
}
