public class Light {
    private boolean lightsOn = false;
    private boolean isBackLightOn = false;
    private boolean redLights = false;
    private final HighBeam highBeam;

    public Light() {
        highBeam = new HighBeam();
    }

    public void turnOff() {
        lightsOn = false;
        isBackLightOn = false;
        redLights = false;
        highBeam.isOn = false;
    }

    public void switchHighBeam() {
        if(isLightsOn()) {
            highBeam.switchHighBeam();
        }
    }

    public void switchRedLights() {
        this.redLights = !redLights;
    }

    public void switchBackLight() {
        isBackLightOn =  !isBackLightOn;
    }

    public HighBeam getHighBeam() {
        return highBeam;
    }

    public boolean getRedLights() {
        return redLights;
    }


    public boolean isBackLightOn() {
        return isBackLightOn;
    }

    public boolean isLightsOn() {
        return lightsOn;
    }

    public void setLightsOn(boolean lightsOn) {
        this.lightsOn = lightsOn;
    }

    public boolean isHighBeamOn() {
        return this.getHighBeam().isOn();
    }

    void switchLights() {
        lightsOn = !lightsOn;
    }

    private class HighBeam {
        boolean isOn = false;

        public boolean isOn() {
            return isOn;
        }

        public void switchHighBeam() {
            isOn = !isOn;
        }


    }
}
