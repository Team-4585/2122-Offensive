/*----------------------------------------------------------------------------*/
/* Copym_right (c) 2017-2018 FIRST. All m_rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * A class for the Human, responsible for making all of the calculations after receiving values from the Joystick.
 */
public class Human
{
    MecanumChassis m_targChassis;
    NewJoystick m_targJoystick;
    double m_forwardSpeed = 0.0;
    double m_twistSpeed = 0.0;
    double m_deadZone = 0.2;
    double m_strafeSpeed = 0.0;

    /**
     * A parameterized constructor for the Human.
     * @param tempChassis The chassis to move the robot.
     * @param tempJoystick The joystick to read values and gather information.
     */
    public Human(MecanumChassis tempChassis, NewJoystick tempJoystick)
    {
        this.m_targChassis = tempChassis;
        this.m_targJoystick = tempJoystick;
    }

    /**
     * A method to calculate direction and speed of the robot, based on the values of m_forwardSpeed and forwardJoystickValue.
     */
    public void makeCalculations()
    {
        double forwardJoystickValue = m_targJoystick.m_forwardAxis;
        m_forwardSpeed = Math.pow(forwardJoystickValue, 2.0);

        //m_theChassis.setVals(m_theJoystick.getForwardAxis(), m_theJoystick.getTwistAxis(), m_theJoystick.getStrafeAxis());
        if (forwardJoystickValue > m_deadZone)
        {
            m_targChassis.setCommand(MecanumChassis.chassisCommands.MOVEFORWARD, m_forwardSpeed);
        }
        else if (forwardJoystickValue < -m_deadZone)
        {
            m_targChassis.setCommand(MecanumChassis.chassisCommands.MOVEBACKWARD, m_forwardSpeed);
        }
        else
        {
            m_targChassis.setCommand(MecanumChassis.chassisCommands.DONOTHING, 0.0);
        }
        
        double twistJoystickValue = m_targJoystick.m_twistAxis;
        m_twistSpeed = Math.pow(twistJoystickValue, 2.0);

        if (twistJoystickValue > m_deadZone)
        {
            m_targChassis.setRotateCommand(MecanumChassis.rotateCommands.TURNRIGHT, m_twistSpeed);
        }
        else if (twistJoystickValue < -m_deadZone)
        {
            m_targChassis.setRotateCommand(MecanumChassis.rotateCommands.TURNLEFT, m_twistSpeed);
        }
        else
        {
            m_targChassis.setRotateCommand(MecanumChassis.rotateCommands.NOROTATE, 0.0);
        }

        double strafeJoystickValue = m_targJoystick.m_strafeAxis;
        m_strafeSpeed = Math.pow(strafeJoystickValue, 2.0);

        if (strafeJoystickValue > m_deadZone)
        {
            m_targChassis.setStrafeCommand(MecanumChassis.strafeCommands.STRAFERIGHT, m_strafeSpeed);
        }
        else if (strafeJoystickValue < -m_deadZone)
        {
            m_targChassis.setStrafeCommand(MecanumChassis.strafeCommands.STRAFELEFT, m_strafeSpeed);
        }
        else
        {
            m_targChassis.setStrafeCommand(MecanumChassis.strafeCommands.NOSTRAFE, 0.0);
        }

    }

    public void setDeadZone(double deadZone) {
        m_deadZone = deadZone;
    }
}
