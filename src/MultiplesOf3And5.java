import java.util.Scanner;

public class MultiplesOf3And5 {

	public static void main(String[] args) {
		System.out.println("What is the maximal number?");
		Scanner input = new Scanner(System.in);
		int max = input.nextInt();
		SumOf3Or5 result = new SumOf3Or5();
		result.sumIfDividableBy3Or5(max);
	}
}
