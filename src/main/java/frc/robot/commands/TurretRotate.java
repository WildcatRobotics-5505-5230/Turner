// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package frc.robot.commands;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.command.PIDCommand;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.Robot;

/**
 *
 */
public class TurretRotate extends PIDCommand {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
 
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

    private NetworkTable table;
    private double Kp, Ki, Kd;

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
    public TurretRotate() {

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR

        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=PID
        super("TurretRotate", 0.07, 0.0, 0.01, 0.05);
        getPIDController().setContinuous(false);
        getPIDController().setAbsoluteTolerance(0.05);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=PID
  //      super("TurretRotate", 1.0, 0.0, 0.0, 0.1);
    //    getPIDController().setContinuous(false);
      //  getPIDController().setAbsoluteTolerance(0.2);
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.turretrotate);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES

        table = NetworkTableInstance.getDefault().getTable("limelight");

   /*     Kp = .5;
        SmartDashboard.putNumber("Kp", Kp);
        Ki = 0;
        SmartDashboard.putNumber("Ki", Ki);
        Kd = 0;
        SmartDashboard.putNumber("Kd", Kd); */
    }

    @Override
    protected double returnPIDInput() {
        // Return your input value for the PID loop
        // e.g. a sensor, like a potentiometer:
        // yourPot.getAverageVoltage() / kYourMaxVoltage;

        return table.getEntry("tx").getDouble(0);
    }

    @Override
    protected void usePIDOutput(double output) {
        // Use output to drive your system, like a motor
        // e.g. yourMotor.set(output);

        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=OUTPUT

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=OUTPUT
        Robot.turretrotate.setAutoSpeed(-output);
    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
        table.getEntry("ledMode").setNumber(3);
        
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {


  //      Kp = SmartDashboard.getNumber("Kp", 0);
    //    Kd = SmartDashboard.getNumber("Kd", 0);
      //  Ki = SmartDashboard.getNumber("Ki", 0);

   //     getPIDController().setD(Kd);
   //     getPIDController().setI(Ki);
     //   getPIDController().setP(Kp);
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    @Override
    protected void end() {
        Robot.turretrotate.setSpeed(0);
        table.getEntry("ledMode").setNumber(1);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
    protected void interrupted() {
        end();
        table.getEntry("ledMode").setNumber(1);
    }
}
