package Comman_pattern;

public class GamingKeyboardTurnoff implements Command{
	
	GamingKeyboardCommands turnoff;

	public GamingKeyboardTurnoff(GamingKeyboardCommands turnoff) {
		this.turnoff = turnoff;
	}

	
	public void execute() {
		turnoff.Turnoff();
	}


	@Override
	public void undo() {
		// TODO Auto-generated method stub
		turnoff.GamingKeyboard_TurnOn();
		
	}

}
