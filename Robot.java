/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team3352.robot;

import com.ctre.*;
import edu.wpi.first.wpilibj.drive.RobotDriveBase;
import edu.wpi.first.wpilibj.SendableBase;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.BaseMotorController;

/**
 * This is a demo program showing the use of the RobotDrive class, specifically
 * it contains the code necessary to operate a robot with tank drive.
 */

public class Robot extends IterativeRobot {
	private DifferentialDrive m_myRobot;
	private Joystick m_leftStick;
	private Joystick m_rightStick;
	   WPI_TalonSRX m_frontLeft = new WPI_TalonSRX(1);
	   WPI_TalonSRX m_rearLeft = new WPI_TalonSRX(2);
	   SpeedControllerGroup m_left = new SpeedControllerGroup(m_frontLeft, m_rearLeft);

		   WPI_TalonSRX m_frontright = new WPI_TalonSRX(1);
		   WPI_TalonSRX m_rearright = new WPI_TalonSRX(2);
		   SpeedControllerGroup m_right = new SpeedControllerGroup(m_frontright, m_rearright);
		   
	@Override
	public void robotInit() {
		m_leftStick = new Joystick(0);
		m_rightStick = new Joystick(1);
	}
;

	@Override
	public void teleopPeriodic() {
		m_myRobot.tankDrive(m_leftStick.getY(), m_rightStick.getY());
	}
}