import java.io.*;
public class Ex01 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int firstNumber;
		int secondNumber;
		int sum;
		System.out.print("Enter first number: ");
		firstNumber = Integer.parseInt(br.readLine());
		System.out.print("Enter second number: ");
		secondNumber = Integer.parseInt(br.readLine());
		sum = firstNumber + secondNumber;
		System.out.printf("The sum of %d and %d is: %d\n",firstNumber, secondNumber, sum);
	}

}
