package frc.robot;

import frc.robot.biblioteca.*;
import frc.robot.biblioteca.basesubsystem.*;

public class MecanumChassis 
{
/**
    An enum with three commands to move the robot.
     */
    public enum chassisCommands
    {
        MOVEFORWARD,
        MOVEBACKWARD,
        DONOTHING
    }
    public enum rotateCommands
    {
        TURNRIGHT,
        TURNLEFT,
        NOROTATE
    }
    public enum strafeCommands
    {
        STRAFELEFT,
        STRAFERIGHT,
        NOSTRAFE
    }

    MecanumDrive m_driveTrain;
       
    HuskyTalon front_left;
    HuskyTalon back_left;
    HuskyTalon front_right;
    HuskyTalon back_right;

    double forwardVal = 0.0;
    double twistVal = 0.0;
    double strafeVal = 0.0;
    chassisCommands m_currentCommand = chassisCommands.DONOTHING;
    rotateCommands m_rotateCommand = rotateCommands.NOROTATE;
    strafeCommands m_strafeCommand = strafeCommands.NOSTRAFE;
    double m_commandParameter = 0.0;
    double m_rotateParameter = 0.0;
    double m_strafeParameter = 0.0;
    
    /**
    A blank constructor
    */
    public MecanumChassis()
    {

    }

    /**
    A method that sets the four motor controllers to the chassis and creates a mecanum drive wtih the four controllers.
    */
    public void mecanumChassisInit()
    {
        front_left = new HuskyTalon(1); // make sure to check values with phoenix tuner after wiring. 
        back_left = new HuskyTalon(3);
        front_right = new HuskyTalon(2);
        back_right = new HuskyTalon(4);

        m_driveTrain = new MecanumDrive(front_left, front_right, back_left, back_right);

    }

    /**
    A method that moves the robot, based on the command given and the speed inputted.
    */
    public void chassisDoActions()
    {
        switch (m_currentCommand)
        {
            //For some reason, setStrafe is what we would consider setForward to be
            case MOVEFORWARD:
                m_driveTrain.setForward(m_commandParameter);
                break;

            case MOVEBACKWARD:
                m_driveTrain.setForward(-m_commandParameter);
                break;

            default:
            case DONOTHING:
                m_driveTrain.setForward(0.0);
                break;
        }


        // m_driveTrain.setForward(forwardVal);
        // m_driveTrain.setTwist(twistVal);
        // m_driveTrain.setStrafe(strafeVal);
    }
    
    public void chassisRotateActions()
    {
        switch (m_rotateCommand) {
            case TURNRIGHT:
                m_driveTrain.setTwist(-m_rotateParameter);
                //m_driveTrain.setInvertRight(false);
                //m_driveTrain.setInvertLeft(false);
                break;
            case TURNLEFT:
                m_driveTrain.setTwist(-m_rotateParameter);
                //m_driveTrain.setInvertRight(true);
                //m_driveTrain.setInvertLeft(true);
                break;
            default:
            case NOROTATE:
                m_driveTrain.setTwist(0.0);
                //m_driveTrain.setInvertRight(false);
                //m_driveTrain.setInvertLeft(false);
                break;        
        }
    }
    public void chassisStrafeActions()
    {
        switch(m_strafeCommand){
            case STRAFERIGHT:
                m_driveTrain.setStrafe(-m_strafeParameter);
                break;
            case STRAFELEFT:
                m_driveTrain.setStrafe(-m_strafeParameter);
                break;
            case NOSTRAFE:
                m_driveTrain.setStrafe(0.0);
                break;
        }
    }

    /**
    A method that initializes the values of forward, twist, and strafe 
    */
    private void setVals(double forward, double twist, double strafe)
    {
        forwardVal = forward;
        twistVal = twist;
        strafeVal = strafe;
    }

    /**
    Initializes the commands for the speed and the type of movement
    */
    public void setCommand(chassisCommands targetCommand, double commandParam)
    {
        this.m_currentCommand = targetCommand;
        this.m_commandParameter = commandParam;
    }
    public void setRotateCommand(rotateCommands targetCommand, double commandParam)
    {
        this.m_rotateCommand = targetCommand;
        this.m_commandParameter = commandParam;
    }
    public void setStrafeCommand(strafeCommands targetCommand, double commandParam)
    {
        this.m_strafeCommand = targetCommand;
        this.m_commandParameter = commandParam;
    }

     //m_driveTrain.setStrafe(m_driveControl.getAxis(RobotConstants.strafeAxis)*RobotConstants.strafeMultiplier);
     //m_driveTrain.setTwist(m_driveControl.getAxis(RobotConstants.twistAxis)*RobotConstants.twistMultiplier);
     //m_driveTrain.setForward(m_driveControl.getAxis(RobotConstants.forwardAxis)*RobotConstants.forwardMultiplier);
     //m_driveTrain.setThrottle(m_driveControl.getAxis(RobotConstants.throttleAxis)*RobotConstants.throttleMultiplier);
      //double speed = m_weaponsControl.getAxis(3);
    // }
    // m_shooter.setShoot(m_weaponsControl.getAxis(RobotConstants.shootAxis));
    // m_victor.set(m_weaponsControl.getAxis(RobotConstants.intakeAxis));
    // if (m_weaponsControl.getButton(1)) {
    //   m_shooter.rotateY(-0.2);
    // } else {
    //   m_shooter.rotateY(m_weaponsControl.getAxis(RobotConstants.aimAxis)/2);
    // }
    // m_victor1.set(Math.max(m_weaponsControl.getAxis(RobotConstants.intakeAxis), m_weaponsControl.getAxis(RobotConstants.shootAxis)));
    
}