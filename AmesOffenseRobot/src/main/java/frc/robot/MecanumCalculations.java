
package frc.robot;
import frc.robot.biblioteca;

public class MecanumCalculations{
    HuskyTalon frontLeftMotor;
    HuskyTalon frontRightMotor;
    HuskyTalon backLeftMotor;
    HuskyTalon backRightMotor;
    public MecanumCalculations(HuskyTalon front_left, HuskyTalon front_right, HuskyTalon back_left, HuskyTalon back_right){
        frontLeftMotor = front_left;
        frontRightMotor = front_right;
        backLeftMotor = back_left;
        backRightMotor = back_right;

    }
    
    public void engageMotors(){
        frontLeftMotor.set(m_forward - (m_twist * 1)+ m_strafe); 
        frontRightMotor.set(m_forward - (m_twist * 1)+ m_strafe);
        backLeftMotor.set(m_forward - (m_twist * 1)+ m_strafe);
        backRightMotor.set(m_forward - (m_twist * 1)+ m_strafe);


    }


}