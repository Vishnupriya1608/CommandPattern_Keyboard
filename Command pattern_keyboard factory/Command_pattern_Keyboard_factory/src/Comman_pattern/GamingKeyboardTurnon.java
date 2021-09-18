package Comman_pattern;

public class GamingKeyboardTurnon implements Command{
	
	GamingKeyboardCommands turnon;

	public GamingKeyboardTurnon(GamingKeyboardCommands turnon) {
		this.turnon = turnon;
	}

	
	public void execute() {
		turnon.GamingKeyboard_TurnOn();
		turnon.GamingSetVolume(25);
		turnon.GamingSetBrightness(75);
	}


	@Override
	public void undo() {
		// TODO Auto-generated method stub
		turnon.Turnoff();
		
	}

}
