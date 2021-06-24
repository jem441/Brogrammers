package day4;

public class Loops {

	public static void main(String[] args) {
		int i = 0;
		int intArray[] = new int[51];
		
		while (i < 50) {
			//System.out.println(i+1);
			intArray[i]=i+1;
			i++;
		}
		
		int counter= 0;
		do {
			int f=0;
			if (intArray[f]%2!=0) {
				intArray[f]+=5;
			}
			f++;
			counter++;
		}while(counter < intArray.length);
		
		for (int k=0;k<intArray.length;k++) {
			if (intArray[k]%6 == 0 && intArray[k]%4 == 0) {
				System.out.println("FOUR!!SIX!!");
			}
			else if (intArray[k]%4 == 0) {
				System.out.println("FOUR!!");
			}
			else if (intArray[k]%6 == 0) {
				System.out.println("SIX!!");
			}
			else{
				System.out.println(intArray[k]);
			}
		}

	}

}
