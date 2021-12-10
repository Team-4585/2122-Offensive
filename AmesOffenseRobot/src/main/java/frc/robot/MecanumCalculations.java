
package frc.robot;
import frc.robot.biblioteca.*;

public class MecanumCalculations{
    HuskyTalon frontLeftMotor;
    HuskyTalon frontRightMotor;
    HuskyTalon backLeftMotor;
    HuskyTalon backRightMotor;

    double m_forward;
    double m_strafe;
    double m_twist;

    public void mecanumCalculationsInit(double forward, double strafe, double twist) {
        m_forward = forward;
        m_strafe = strafe;
        m_twist = twist;
    }

    public MecanumCalculations(HuskyTalon front_left, HuskyTalon front_right, HuskyTalon back_left, HuskyTalon back_right){
        frontLeftMotor = front_left;
        frontRightMotor = front_right;
        backLeftMotor = back_left;
        backRightMotor = back_right;

    }
    
    


}