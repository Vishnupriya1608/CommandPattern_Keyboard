package Comman_pattern;

public class BrightnessDown implements Command{
	
	NormalKeyboardCommand brightnessdown;

	public BrightnessDown(NormalKeyboardCommand brightnessdown) {
		this.brightnessdown = brightnessdown;
	}

	
	public void execute() {
		brightnessdown.BrightnessDecrease();
	}


	
	public void undo() {
		
		brightnessdown.BrightnessIncrease();
		
	}

}
