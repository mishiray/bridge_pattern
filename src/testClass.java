import controllers.BasicController;
import interfaces.MotorDevice;
import devices.*;

public class testClass {
    public static void testMotor(MotorDevice device){
        System.out.println("Remote 1");
        BasicController basicController = new BasicController(device);
        basicController.power();
        device.getStatus();

        System.out.println("Remote 2");
        BasicController basicController2 = new BasicController(device);
        basicController2.power();
        basicController2.speedDown();
        basicController2.speedDown();
        device.getStatus();
    }

    public static void main(String[] args) {
        testMotor(new Fan());
        testMotor(new WindVane());
    }
}

