package guru.springframework.dependencyInversionPrinciple1.lowlevel;

import guru.springframework.dependencyInversionPrinciple1.highlevel.Switchable;

public class Fan implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Fan: Fan turned on...");
    }
    @Override
    public void turnOff() {
        System.out.println("Fan: Fan turned off...");
    }
}