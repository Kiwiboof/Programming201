package frc.robot.commands;
 
import frc.robot.RobotContainer;
import frc.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;
 
public class VariableCommand extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final ExampleSubsystem m_subsystem;
 
  public VariableCommand(ExampleSubsystem subsystem) {
    m_subsystem = subsystem;
    addRequirements(subsystem);
  }
 
  @Override
  public void initialize() {}
 
  @Override
  public void execute() {
    m_subsystem.go(RobotContainer.getIntakeSpeed());
  }
 
  @Override
  public void end(boolean interrupted) {
    m_subsystem.stopMotor();
  }
 
  @Override
  public boolean isFinished() {
    return false;
  }
}