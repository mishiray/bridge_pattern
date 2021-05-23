package controllers;

import interfaces.Controller;
import interfaces.MotorDevice;


public class BasicController implements Controller {

    protected MotorDevice device;

    public BasicController(){}

    public BasicController(MotorDevice device){
        this.device = device;
    }

    @Override
    public void power() {
        System.out.println("Control: Toggle Power");
        if ((device.isEnabled())) {
            device.disable();
        } else {
            device.enable();
        }
    }

    @Override
    public void speedUp() {
        if(device.isEnabled()){
            System.out.println("Control: Speed Up");
            device.setSpeed(device.getSpeed()+10);
        }
    }

    @Override
    public void speedDown() {
        if(device.isEnabled()){
            System.out.println("Control: Speed Down");
            device.setSpeed(device.getSpeed()-10);
        }
    }
}
