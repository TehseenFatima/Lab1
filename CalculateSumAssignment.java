public class CalculateSumAssignment {

	public static void main(String[] args) {
		System.out.println("Sum of first 9 natural numbers: "+calculateSum(5));

	}
	public static int calculateSum(int n) {
		if(n<=0)
			System.out.println("Provide valid n");
		int sum = 0;
		for(int i=1;i<=n;i++) {
			if(i%3==0 || i%5==0)
				sum += i;
		}
		return sum;
	}

}
