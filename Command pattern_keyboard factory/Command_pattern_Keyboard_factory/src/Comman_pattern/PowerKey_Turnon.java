package Comman_pattern;

public class PowerKey_Turnon implements Command{
	
	NormalKeyboardCommand turnon;

	public PowerKey_Turnon(NormalKeyboardCommand turnon) {
		this.turnon = turnon;
	}

	
	public void execute() {
		turnon.TurnOn();
		turnon.SetVolume(50);
		turnon.SetBrightness(60);
	}


	@Override
	public void undo() {
		// TODO Auto-generated method stub
		turnon.Shutdown();
	}


}
