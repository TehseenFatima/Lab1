public class CheckIncreasingNumberAssignment {

	public static void main(String[] args) {
		if(checkNumber(13059))
			System.out.println("It is an increasing number");
		else
			System.out.println("It is not an increasing number");
	}
	
	public static boolean checkNumber(int number) {
		String numberString = Integer.toString(number);
		for(int i=1;i<numberString.length();i++) {
			if(Integer.parseInt(Character.toString(numberString.charAt(i-1)))>Integer.parseInt(Character.toString(numberString.charAt(i))))
				return false;
		}
		return true;
	}

}