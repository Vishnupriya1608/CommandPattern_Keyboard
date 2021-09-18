package Comman_pattern;

public class VolumeUp implements Command{
	
	NormalKeyboardCommand volumeup;

	public VolumeUp(NormalKeyboardCommand volumeup) {
		this.volumeup = volumeup;
	}

	
	public void execute() {
		volumeup.VolumeIncrease();;
	}


	@Override
	public void undo() {
		// TODO Auto-generated method stub
		volumeup.VolumeDecrease();
		
	}
	
	
	

}
