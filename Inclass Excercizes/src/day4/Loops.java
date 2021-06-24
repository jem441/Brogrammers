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
			for (int j=0;j<intArray.length;j++) {
				if (intArray[j]%2!=0) {
					intArray[j]+=5;
					//System.out.println(intArray[i]);
				}
			counter++;
			}
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
