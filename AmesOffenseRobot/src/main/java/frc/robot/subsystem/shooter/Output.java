package frc.robot.subsystem.shooter;

public abstract class Output {
    private double motorSpeed;
    
    public Output() {
        
    }
    abstract void engageMotorsInward();
    abstract void engageMotorsOutward();    
}
