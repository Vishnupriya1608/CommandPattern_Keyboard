package Comman_pattern;

public class PowerKey_Sleep implements Command{
	
	NormalKeyboardCommand sleep;

	public PowerKey_Sleep(NormalKeyboardCommand sleep) {
		this.sleep = sleep;
	}

	
	public void execute() {
		sleep.Sleep();
	}


	@Override
	public void undo() {
		// TODO Auto-generated method stub
		sleep.TurnOn();
	}

}
