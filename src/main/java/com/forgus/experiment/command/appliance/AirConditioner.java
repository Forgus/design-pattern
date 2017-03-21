package com.forgus.experiment.command.appliance;

/**
 * @author Wenbin Chen
 */
public class AirConditioner {

    public static final int DEFAULT_TEMP = 25;
    public static final int DEFAULT_SPEED = 10;

    private int temp;
    private int speed;

    public AirConditioner() {
        init();
    }

    private void init() {
        setTemp(DEFAULT_TEMP);
        setSpeed(DEFAULT_SPEED);
    }

    public void turnOn() {
        System.out.println("开启空调，设定温度：" + getTemp() + ",风速：" + getSpeed());
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


}
