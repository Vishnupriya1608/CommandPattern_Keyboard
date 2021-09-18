package Comman_pattern;

public class VolumeDown implements Command{
	
	NormalKeyboardCommand volumedown;

	public VolumeDown(NormalKeyboardCommand volumedown) {
		this.volumedown = volumedown;
	}

	
	public void execute() {
		volumedown.VolumeDecrease();;
	}


	@Override
	public void undo() {
		// TODO Auto-generated method stub
		volumedown.VolumeIncrease();
		
	}

}
