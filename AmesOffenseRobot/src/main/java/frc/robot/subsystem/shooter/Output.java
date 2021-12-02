package frc.robot.subsystem.shooter;

public abstract class Output {
    private double motorSpeed;
    
    public Output() {
        
    }
    
    abstract void engageMotorsOutward();    
}
