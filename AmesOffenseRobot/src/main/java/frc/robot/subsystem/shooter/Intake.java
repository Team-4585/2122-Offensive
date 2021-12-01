package frc.robot.subsystem.shooter;

public abstract class Intake{
    private double motorSpeed;
    
    public Intake() {
        
    }
    abstract void engageMotorsInward();
    abstract void engageMotorsOutward();
    
}