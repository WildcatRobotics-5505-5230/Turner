// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package frc.robot;

import frc.robot.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.subsystems.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
public JoystickButton lBumper;
public JoystickButton rBumper;
public JoystickButton a;
public JoystickButton b;
public JoystickButton y;
public JoystickButton sTART;
public JoystickButton x;
public Joystick xbox1;
public JoystickButton rBump;
public JoystickButton lBump;
public JoystickButton a1;
public JoystickButton y1;
public JoystickButton b1;
public JoystickButton x1;
public Joystick xbox2;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

xbox2 = new Joystick(1);

x1 = new JoystickButton(xbox2, 3);
x1.whileHeld(new RunHopper());
b1 = new JoystickButton(xbox2, 2);
b1.whileHeld(new Shoot());
y1 = new JoystickButton(xbox2, 4);
y1.whenPressed(new ToggleRotateIntake());
a1 = new JoystickButton(xbox2, 1);
a1.whileHeld(new TurretRotate());
lBump = new JoystickButton(xbox2, 5);
lBump.whileHeld(new IntakeOut());
rBump = new JoystickButton(xbox2, 6);
rBump.whileHeld(new IntakeIn());
xbox1 = new Joystick(0);

x = new JoystickButton(xbox1, 3);
x.whileHeld(new ReverseWinch());
sTART = new JoystickButton(xbox1, 8);
sTART.whenPressed(new ReverseWinchBrake());
y = new JoystickButton(xbox1, 4);
y.whenPressed(new ClimbUp());
b = new JoystickButton(xbox1, 2);
b.whenPressed(new Brake());
a = new JoystickButton(xbox1, 1);
a.whileHeld(new WinchUp());
rBumper = new JoystickButton(xbox1, 6);
rBumper.whenPressed(new toggleJoystickDrive());
lBumper = new JoystickButton(xbox1, 5);
lBumper.whenPressed(new Shift());


        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("JoystickDrive", new JoystickDrive());
        SmartDashboard.putData("IntakeIn", new IntakeIn());
        SmartDashboard.putData("IntakeOut", new IntakeOut());
        SmartDashboard.putData("ToggleRotateIntake", new ToggleRotateIntake());
        SmartDashboard.putData("Shift", new Shift());
        SmartDashboard.putData("TurretRotate", new TurretRotate());
        SmartDashboard.putData("TurretRotateManual", new TurretRotateManual());
        SmartDashboard.putData("TurretHoodManual", new TurretHoodManual());
        SmartDashboard.putData("Shoot", new Shoot());
        SmartDashboard.putData("ClimbUp", new ClimbUp());
        SmartDashboard.putData("Brake", new Brake());
        SmartDashboard.putData("WinchUp", new WinchUp());
        SmartDashboard.putData("ReverseWinchBrake", new ReverseWinchBrake());
        SmartDashboard.putData("baselineAuton", new baselineAuton());
        SmartDashboard.putData("toggleJoystickDrive", new toggleJoystickDrive());
        SmartDashboard.putData("ReverseWinch", new ReverseWinch());
        SmartDashboard.putData("RunHopper", new RunHopper());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

    SmartDashboard.putData("driveStraight", new driveStraight(0, 0));
    SmartDashboard.putData("RobotTurn", new RobotTurn(0, 0));
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
public Joystick getxbox1() {
        return xbox1;
    }

public Joystick getxbox2() {
        return xbox2;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

