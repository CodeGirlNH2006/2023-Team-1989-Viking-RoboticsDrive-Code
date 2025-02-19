// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

public class Arm extends SubsystemBase {
  /** Creates a new Arm. */
  private final WPI_TalonSRX m_elbow;
  private final WPI_TalonSRX m_wrist;
  public Arm() {
    m_elbow = new WPI_TalonSRX(5);
    m_wrist = new WPI_TalonSRX(6);
  }

  public void upDown(double speed) {
    m_elbow.set(speed);
  }
  public void wrist(double speed) {
    m_wrist.set(speed);
  }

  
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
