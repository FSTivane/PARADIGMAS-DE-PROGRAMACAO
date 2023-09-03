import java.util.Scanner;
public class Ex03{
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		int a, b;

		System.out.print("Digite um numero: ");
		a = key.nextInt();
		System.out.print("Digite outro numero: ");
		b = key.nextInt();

		if(a % b == 0 || b % a == 0){
			System.out.println("Sao Multiplos!");
		}
		else{
			System.out.println("Nao sao Multiplos!");
		}

		key.close();

	}
}