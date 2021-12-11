package frc.robot.subsystem.shooter;

import frc.robot.biblioteca.*;
public class AmesIntake extends Intake{
    HuskyVictor intakeMotor;
    public AmesIntake(){
        intakeMotor = new HuskyVictor(7);
        motorSpeed = 0.8;
    }
    public void resetIntakeMotorSpeed()
    {
        motorSpeed = 0.0;
    }

     public void restoreIntakeMotorSpeed()
    {
        motorSpeed = 0.8;
    }

    //@Override
    public void engageMotorsInward() {
    intakeMotor.set(motorSpeed);
    }
    //@Override
    public void engageMotorsOutward () {
    
    }

}