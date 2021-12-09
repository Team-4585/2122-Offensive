package frc.robot.subsystem.shooter;

public class AmesOutput extends Output{
    HuskyVictor leftShooterMotor;
    HuskyVictor rightShooterMotor;

    public AmesOutput(){
    leftShooterMotor = new HuskyVictor(0);
    rightShooterMotor = new HuskyVictor(1);
    motorSpeed = 0.4;
    }
    @Override
    public void engageMotorsInward(){

    }
    @Override
    public void engageMotorsOutward(){
    leftShooterMotor.set(motorSpeed);
    rightShooterMotor.set(motorSpeed);
   
    }
    
}
