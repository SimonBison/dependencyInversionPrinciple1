package guru.springframework.dependencyInversionPrinciple1;

import guru.springframework.dependencyInversionPrinciple1.highlevel.ElectricPowerSwitch;
import guru.springframework.dependencyInversionPrinciple1.highlevel.Switch;
import guru.springframework.dependencyInversionPrinciple1.highlevel.Switchable;
import guru.springframework.dependencyInversionPrinciple1.lowlevel.Fan;
import guru.springframework.dependencyInversionPrinciple1.lowlevel.LightBulb;
import org.junit.Test;

public class ElectricPowerSwitchTest {

    @Test
    public void testPress() throws Exception{
        Switchable switchableBulb = new LightBulb();
        Switch bulbPowerSwitch = new ElectricPowerSwitch(switchableBulb);
        bulbPowerSwitch.press();
        bulbPowerSwitch.press();
        Switchable switchableFan = new Fan();
        Switch fanPowerSwitch = new ElectricPowerSwitch(switchableFan);
        fanPowerSwitch.press();
        fanPowerSwitch.press();
    }
}
