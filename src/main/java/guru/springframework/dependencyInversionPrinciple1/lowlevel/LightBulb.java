package guru.springframework.dependencyInversionPrinciple1.lowlevel;

import guru.springframework.dependencyInversionPrinciple1.highlevel.Switchable;

public class LightBulb implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("LightBulb: Bulb turned on...");
    }
    @Override
    public void turnOff() {
        System.out.println("LightBulb: Bulb turned off...");
    }
}