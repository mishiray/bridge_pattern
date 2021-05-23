package interfaces;

public interface MotorDevice {
    boolean isEnabled();

    void enable();

    void disable();

    int getSpeed();

    void setSpeed(int value);

    void getStatus();
}
