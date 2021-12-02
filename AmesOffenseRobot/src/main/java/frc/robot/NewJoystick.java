package frc.robot;

import frc.robot.biblioteca.HuskyJoystick;

/**
 * A class for the Joystick, which gathers information from X, Y, Z axis.
 */
public class NewJoystick
{
    HuskyJoystick m_driveControl;
    double m_forwardAxis = 0.0;
    double m_twistAxis = 0.0;
    double m_strafeAxis = 0.0;
    boolean m_button1 = false;
    boolean m_button2 = false;

    /**
     * A blank constructor for the joystick.
     */
    public NewJoystick()
    {
       
    }

    /**
     * Initializes the m_driveControl variable as a new HuskyJoystick.
     */
    public void newJoystickInit()
    {
        m_driveControl = new HuskyJoystick(0);
    }

    /**
     * Initializes the values of both forward axis and twist axis, and the two buttons found on the joystick.
     */
    public void gatherInformation()
    {
        m_forwardAxis = m_driveControl.getAxis(RobotConstants.forwardAxis);
        m_twistAxis = m_driveControl.getAxis(RobotConstants.twistAxis); 
        m_strafeAxis = m_driveControl.getAxis(RobotConstants.strafeAxis);
    } 

    /**
     * Returns the forward (Y) axis.
     * @return A double value for the forward (Y) axis.
     */
    public double getForwardAxis()
    {
        return m_forwardAxis;
    }

    /**
     * Returns the twisting/rotating (Z) axis.
     * @return A double value for the twisting/rotating (Z) axis.
     */
    public double getTwistAxis()
    {
        return m_twistAxis;
    }

    /**
     * Returns the strafe (X) axis.
     * @return A double value for the strafe (X) axis.
     */
    public double getStrafeAxis()
    {
        return m_strafeAxis;
    }
}