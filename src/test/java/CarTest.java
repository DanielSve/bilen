import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    Car car;

    @BeforeEach
    void init() {
        car = new Car("Volvo",new Owner("Daniel", 37));
    }

    @Test
    void turnCarOff() {
        car.turnCarOff();
        assertFalse(car.getLight().isLightsOn());
        assertFalse(car.getLight().isHighBeamOn());
        assertFalse(car.isCarOn());
    }

    @Test
    void gas() {
        car.turnCarOn();
        car.gas();
        assertEquals(10, car.getSpeed());
    }

    @Test
    void maxSpeed() {
        car.turnCarOn();
        for (int i = 0; i < 20; i++) {
            car.gas();
        }
        assertEquals(car.getSpeed(), Car.MAX_SPEED);
    }

    @Test
    void minSpeed() {
        car.turnCarOn();
        for (int i = 0; i < 20; i++) {
            car.breakDown();
        }
        assertEquals(car.getSpeed(), Car.MIN_SPEED);
    }

    @Test
    void breakDown() {
        car.turnCarOn();
        car.gas();
        car.breakDown();
        assertEquals(0, car.getSpeed());
    }

    @Test
    void switchGear() {
        car.switchGear(Gear.DRIVE);
        assertEquals(car.getGear(), Gear.DRIVE);
    }
}