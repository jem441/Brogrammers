
public class WaterSystem {
	
	public static void main(String args[]) {
		int precipitation = 0;
		int waterOutput = 0;
		int temperature = 80;
		
		if (precipitation < 20) {
			waterOutput = 30;
		}else if (precipitation < 31) {
			waterOutput = 10;
		}else if (precipitation < 56) {
			waterOutput = 0;
		}else {
			waterOutput = 0;
		}
		
		System.out.println("The water output should be " + waterOutput);
		
		if (precipitation < 20) {
			if (temperature <= 75) {
				waterOutput = 30;
			}else {
				waterOutput = 45;
			}
		}else if (precipitation < 30) {
			if (temperature <= 75) {
				waterOutput = 10;
			}else {
				waterOutput = 25;
			}
		}else if (precipitation < 55) {
			if (temperature <= 75) {
				waterOutput = 0;
			}else {
				waterOutput = 15;
			}
		}else {
			waterOutput = 0;	
		}
	
		System.out.println("The water output should be " + waterOutput);
	}
}
