import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LightTest {

    Light light;

    @BeforeEach
    public void init() {
        light = new Light();
    }

    @Test
    void switchLights() {
        light.switchLights();
        assertTrue(light.isLightsOn());
        light.switchLights();
        assertFalse(light.isLightsOn());
    }

    @Test
    void areLightsOn() {
        light.switchLights();
        assertTrue(light.isLightsOn());
    }

    @Test
    void areLightsOff() {
        assertFalse(light.isLightsOn());
    }

    @Test
    void isHighBeamOn() {
        assertFalse(light.isHighBeamOn());
    }

    @Test
    void switchHighBeamOn() {
        light.switchLights();
        light.switchHighBeam();
        assertTrue(light.isHighBeamOn());
    }

    @Test
    void turnLightOff() {
        light.turnOff();
        assertFalse(light.isLightsOn());
        assertFalse(light.isHighBeamOn());
        assertFalse(light.isLightsOn());
    }

    @Test
    void isBackLightOn() {
        light.switchLights();
        light.switchHighBeam();
        assertTrue(light.isHighBeamOn());
    }

    @Test
    void getRedLights() {
        assertFalse(light.getRedLights());
    }

    @Test
    void switchRedLights() {
        light.switchRedLights();
        assertTrue(light.getRedLights());
    }

}
