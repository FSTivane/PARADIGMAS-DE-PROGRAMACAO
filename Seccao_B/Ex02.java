import java.util.Scanner;
public class Ex02{
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int number;
		System.out.print("Digite um numero: ");
		number = key.nextInt();

		if(number % 2 == 0){
			System.out.println("PAR!");
		}
		else{
			System.out.println("IMPAR!");
		}

		key.close();
	}
}