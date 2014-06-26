public class SumOf3Or5 {
	public void sumIfDividableBy3Or5(int max) {
		int sum = 0;
		for (int i = 0; i <= max; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("The sum of all multiples of 3 and 5 below " + max
				+ " is " + sum);
	}
}
