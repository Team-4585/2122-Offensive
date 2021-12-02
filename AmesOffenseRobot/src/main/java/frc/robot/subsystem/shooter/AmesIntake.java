package frc.robot.subsystem.shooter;


public class AmesIntake extends Intake{
    public AmesIntake(){

    }
    @Override
    public void engageMotorsInward() {
        System.out.println("Taking in the ball.");
    }
    @Override
    public void engageMotorsOutward () {
        System.out.println("Spitting back out the ball.");
    }

}