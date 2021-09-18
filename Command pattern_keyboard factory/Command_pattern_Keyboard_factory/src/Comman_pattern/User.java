package Comman_pattern;

public class User {
	public static void main(String[] args) {
	
	 KeyboardControl control = new KeyboardControl(); // KeyboardControl is independent for both Normal and Gaming Keyboards
	 NormalKeyboardCommand keycommand = new NormalKeyboardCommand();
	 GamingKeyboardCommands gamingkeycommand = new GamingKeyboardCommands();
	 
	 System.out.println("***** Keyboard controls for Regular and Gaming Keyboards*****");
	 
	 control.setCommand(new PowerKey_Turnon(keycommand));
	 control.PressKey();
	 
	 control.setCommand(new GamingKeyboardTurnon(gamingkeycommand));
	 control.PressKey();
	 
	 control.setCommand(new VolumeUp(keycommand));
	 control.PressKey();
	 
	 control.setCommand(new VolumeDown(keycommand));
	 control.PressKey();
	 
	 control.setCommand(new BrightnessUp(keycommand));
	 control.PressKey();
	 
	 control.setCommand(new BrightnessDown(keycommand));
	 control.PressKey();
	 
	 control.setCommand(new PowerKey_Sleep(keycommand));
	 control.PressKey();
	 
	 control.setCommand(new PowerKey_Restart(keycommand));
	 control.PressKey();
	 
	 control.setCommand(new PowerKey_Shutdown(keycommand));
	 control.PressKey();
	 
	 control.setCommand(new GamingKeyboardTurnoff(gamingkeycommand));
	 control.PressKey();
	 
	 //using undo command
	 control.UndoCommand(new PowerKey_Shutdown(keycommand));
	 control.UndoKey();
	 
	 control.UndoCommand(new GamingKeyboardTurnoff(gamingkeycommand));
	 control.UndoKey();

}
}
