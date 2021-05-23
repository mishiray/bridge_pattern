package devices;

import interfaces.MotorDevice;

public class Fan implements MotorDevice {

    private boolean on = false;
    private int speed = 100;

    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        on = true;
    }

    @Override
    public void disable() {
        on = false;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void setSpeed(int value) {
        this.speed = (on) ? (value > 100) ? 100 : (value < 0) ? 0 : value : value;
    }

    @Override
    public void getStatus() {
        System.out.println("------------------------------------");
        System.out.println("| I'm a Fan.");
        System.out.println("| I'm " + (on ? "enabled" : "disabled"));
        System.out.println("| Current speed is " + speed + "%");
        System.out.println("------------------------------------\n");
    }
}
