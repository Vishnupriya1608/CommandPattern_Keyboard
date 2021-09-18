package Comman_pattern;

public class GamingF12 implements Command{
		
		GamingKeyboardCommands f12;

		public GamingF12(GamingKeyboardCommands f12) {
			this.f12 = f12;
		}

		
		public void execute() {
			f12.GamingF12();
		}


		@Override
		public void undo() {
			// TODO Auto-generated method stub
			
		}

}
