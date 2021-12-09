package frc.robot.subsystem.shooter;


public class AmesIntake extends Intake{
    HuskyTalon intakeMotor;
    public AmesIntake(){
    intakeMotor = new HuskyTalon(2);
    motorSpeed = 0.4;
    }
    @Override
    public void engageMotorsInward() {
    intakeMotor.set(motorSpeed);
    }
    @Override
    public void engageMotorsOutward () {
    
    }

}