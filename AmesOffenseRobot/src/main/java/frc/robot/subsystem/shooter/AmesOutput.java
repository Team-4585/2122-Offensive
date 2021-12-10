package frc.robot.subsystem.shooter;

import frc.robot.biblioteca.*;
public class AmesOutput extends Output{
    HuskyVictor leftShooterMotor;
    HuskyVictor rightShooterMotor;

    public AmesOutput(){
        leftShooterMotor = new HuskyVictor(6);
        rightShooterMotor = new HuskyVictor(5);
        motorSpeed = 0.2;
    }
    //@Override
    public void engageMotorsInward(){

    }
    //@Override
    public void engageMotorsOutward(){
    leftShooterMotor.set(-motorSpeed);
    rightShooterMotor.set(motorSpeed);
   
    }
    
}
