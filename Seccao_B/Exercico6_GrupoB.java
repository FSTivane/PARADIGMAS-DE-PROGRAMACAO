import java.io.*;

public class Exercico5_GrupoA {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int valor;
		
		System.out.print("Digite um numero: ");
		valor = Integer.parseInt(br.readLine());
		
		if(valor >= 75 && valor <= 100) {
			System.out.printf("O numero %d encontra-se no intervalo de [75 - 100]", valor);
		}
		else if(valor >= 50 && valor < 75) {
			System.out.printf("\nO numero %d encontra-se no intervalo de [50 - 75]", valor);
		}
		else if(valor >= 25 && valor < 50) {
			System.out.printf("\nO numero %d encontra-se no intervalo de [25 - 50]", valor);
		}
		else if(valor >= 0 && valor < 25) {
			System.out.printf("\nO numero %d encontra-se no intervalo de [0 - 25]", valor);
		}
		else {
			System.out.printf("\nO numero %d nao encontra-se em nenhum dos intervalos", valor);
		}
	}
}
