package Comman_pattern;

public class BrightnessUp implements Command{
	
	NormalKeyboardCommand brightnessup;

	public BrightnessUp(NormalKeyboardCommand brightnessup) {
		this.brightnessup = brightnessup;
	}

	
	public void execute() {
		brightnessup.BrightnessIncrease();;
	}


	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
		brightnessup.BrightnessDecrease();
		
	}

}
