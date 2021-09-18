package Comman_pattern;

public class PowerKey_Shutdown implements Command{
	
	NormalKeyboardCommand shutdown;

	public PowerKey_Shutdown(NormalKeyboardCommand shutdown) {
		this.shutdown = shutdown;
	}

	
	public void execute() {
		shutdown.Shutdown();
	}


	@Override
	public void undo() {
		// TODO Auto-generated method stub
		shutdown.TurnOn();
		
	}

}
