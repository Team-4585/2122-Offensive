package frc.robot.subsystem.shooter;

public abstract class Output {
    protected double motorSpeed;
    
    public Output() {
        
    }
    
    abstract void engageMotorsOutward();    
}
