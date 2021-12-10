package frc.robot.subsystem.shooter;

import frc.robot.biblioteca.*;
public class AmesIntake extends Intake{
    HuskyVictor intakeMotor;
    public AmesIntake(){
        intakeMotor = new HuskyVictor(7);
        motorSpeed = 0.4;
    }
    //@Override
    public void engageMotorsInward() {
    intakeMotor.set(motorSpeed);
    }
    //@Override
    public void engageMotorsOutward () {
    
    }

}