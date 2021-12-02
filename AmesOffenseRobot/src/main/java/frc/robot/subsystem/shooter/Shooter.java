package frc.robot.subsystem.shooter;

public class Shooter {
    private AmesIntake intake;
    private AmesOutput output;

    public Shooter() {

    }

    public void shooterInit() {
        intake = new AmesIntake();
        output = new AmesOutput();
    }

    


    public void shoot() {
        output.engageMotorsOutward();
    }

    public void intake() {
        intake.engageMotorsInward();
    }
}
