public class CheckPowerofTwoNumberAssignment {

	public static void main(String[] args) {
		if(checkNumber(5))
			System.out.println("5 is a power of 2");
		else
			System.out.println("5 is not a power of 2");

	}
	
	public static boolean checkNumber(int n) {
		int count = 0;
		while(true) {
			int powerOfTwo = (int) Math.pow(2,count);
			if(powerOfTwo==n)
				return true;
			else if(powerOfTwo>n)
				return false;
			count += 1;
		}
		
	}

}
