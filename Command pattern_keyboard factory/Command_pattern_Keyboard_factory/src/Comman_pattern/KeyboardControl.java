package Comman_pattern;

public class KeyboardControl {
Command command;
Command nocommand;
	
	public void setCommand(Command command) {
		this.command=command;
		
	}
	public void UndoCommand(Command nocommand) {
		this.nocommand=nocommand;
	}
	public void PressKey() {
		command.execute();
	}
	public void UndoKey() {
		command.undo();
	}

}
