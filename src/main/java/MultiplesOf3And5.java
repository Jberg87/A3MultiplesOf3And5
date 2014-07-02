import java.util.Scanner;

public class MultiplesOf3And5 {
    /*
    * Als input geef je een getal op in de console. Alle getallen lager dan de input waarde worden bij elkaar opgeteld wanneer dit getal deelbaar is door 3 of 5.
    */
	public static void main(String[] args) {
		System.out.println("What is the maximal number?");
		Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int sum = generateSum(input);
        System.out.println("The sum of all multiples of 3 and 5 below " + input
                + " is " + sum);
	}

    public static int generateSum(int input) {
        int sum = 0;
        for (int i = 0; i <= input; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}
