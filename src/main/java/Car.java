public class Car {
    private String brand;
    private double speed = 0;
    private double mileage = 0;
    private Owner owner;
    private boolean isCarOn = false;
    public static final double MAX_SPEED = 180;
    public static final double MIN_SPEED = 0;
    private Gear gear = Gear.DRIVE;
    private final Light light;

    public Car(String brand, Owner owner) {
        this.brand = brand;
        this.owner = owner;
        light = new Light();
    }

    public void switchGear(Gear g) {
        switch (g) {
            case DRIVE -> this.gear = Gear.DRIVE;
            case REVERSE -> this.gear = Gear.REVERSE;
        }
    }

    public Light getLight() {
        return light;
    }

    public Gear getGear() {
        return gear;
    }


    public void gas() {
        if (isCarOn && speed < MAX_SPEED) {
            this.speed += 10;
        }
    }

    public void breakDown() {
        if (isCarOn && speed > MIN_SPEED) {
            this.speed -= 10;
        }
    }

    public double getSpeed() {
        return speed;
    }

    public void turnCarOn() {
        this.isCarOn = true;
    }

    public void turnCarOff() {
        light.turnOff();
        this.isCarOn = false;

    }

    public boolean isCarOn() {
        return isCarOn;
    }
}


