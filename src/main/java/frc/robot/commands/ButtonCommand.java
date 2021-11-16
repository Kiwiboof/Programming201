package frc.robot.commands;
 
import frc.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;
 
public class ButtonCommand extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final ExampleSubsystem m_subsystem;
 
  public ButtonCommand(ExampleSubsystem subsystem) {
    m_subsystem = subsystem;
    addRequirements(subsystem);
  }
 
  @Override
  public void initialize() {
    m_subsystem.go(.3);
  }
 
 @Override
  public void execute() {}
 
  @Override
  public void end(boolean interrupted) {
    m_subsystem.stopMotor();
  }
 
  @Override
  public boolean isFinished() {
    return false;
  }
}