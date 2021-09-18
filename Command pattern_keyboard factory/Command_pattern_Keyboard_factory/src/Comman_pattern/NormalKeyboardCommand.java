package Comman_pattern;

public class NormalKeyboardCommand {
	public void TurnOn() {
		System.out.println("Turn on the computer ");
	}

	public void Shutdown() {
		System.out.println("Shutdown the computer ");
	}
	
	public void Sleep() {
		System.out.println("Sleep");
	}
	public void VolumeIncrease() {
		System.out.println("Increase the volume");
	}
	public void VolumeDecrease() {
		System.out.println("Decrease the volume");
	}
	public void BrightnessIncrease() {
		System.out.println("Increase the Brightness");
	}
	public void BrightnessDecrease() {
		System.out.println("Decrease the Brightness");
	}

	public void Restart() {
		System.out.println("Restart the computer");
		
	}
	public void SetVolume(int Volume) {
		System.out.println("Default Volume for Regular Computer is set to: "+Volume);
	}
	public void SetBrightness(int Brightness) {
		System.out.println("Default Brightness for Regular Computer is set to: "+Brightness);
	}
	
}
