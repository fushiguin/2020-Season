package frc.robot.controls;
import edu.wpi.first.wpilibj.GenericHID;

public class XboxController1 implements ControllerBase{
    edu.wpi.first.wpilibj.XboxController controller1;

    public XboxController1(int port){
        this.controller1 = new edu.wpi.first.wpilibj.XboxController(port);
    }
	@Override
	public double getDrive() {
		double n = this.controller1.getTriggerAxis(GenericHID.Hand.kRight) - this.controller1.getTriggerAxis(GenericHID.Hand.kLeft);
		return Math.abs(n) < 0.1 ? 0 : n;
	}
	
	@Override
	public double getTurn() {
		double n = this.controller1.getX(GenericHID.Hand.kLeft);
		return Math.abs(n) < 0.1 ? 0 : n;
    }
    @Override
    public double getArm(){
        return 0.0;
    }

}