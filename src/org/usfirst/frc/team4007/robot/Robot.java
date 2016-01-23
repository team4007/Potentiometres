package org.usfirst.frc.team4007.robot;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.SampleRobot;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Timer;


public class Robot extends SampleRobot {
	
	Jaguar danny0, danny1, danny2;
    AnalogInput pot0, pot1, pot2;
    double maxValue1 = 4.87;
    double maxValue2 = maxValue1;
    double maxValue3 = maxValue1;
    double speed0, speed1, speed2;
	
    public Robot() {
      pot0 = new AnalogInput(0);
      pot1 = new AnalogInput(1);
      pot2 = new AnalogInput(2);
      danny0 = new Jaguar(0);
      danny1 = new Jaguar(1);
      danny2 = new Jaguar(2);
    }

    public void operatorControl() {
        while(true){
        	speed0 = Math.floor((pot0.getVoltage()/maxValue1) * 100) / 100;
        	speed1 = Math.floor((pot1.getVoltage()/maxValue2) * 100) / 100;
        	speed2 = Math.floor((pot2.getVoltage()/maxValue3) * 100) / 100;
        	danny0.set(speed0);
        	danny1.set(speed1);
        	danny2.set(speed2);
        	//danny2.set(1.0D);
        	System.out.println("Vitesse 0: " + speed0 + "  Vitesse 1: " + speed1 + "  Vitesse 2: " + speed2);
            Timer.delay(0.005);
        }
    }
    
    public void test(){
    	
    }
    
}
