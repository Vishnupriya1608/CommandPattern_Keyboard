package Comman_pattern;

public class PowerKey_Restart implements Command{
	
	NormalKeyboardCommand restart;

	public PowerKey_Restart(NormalKeyboardCommand restart) {
		this.restart = restart;
	}

	
	public void execute() {
		restart.Restart();
	}


	@Override
	public void undo() {
		// TODO Auto-generated method stub
		restart.Shutdown();
		
	}

}
