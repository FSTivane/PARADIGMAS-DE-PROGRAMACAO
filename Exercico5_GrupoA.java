import java.io.*;
public class PecasA {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int codigoPeca1, codigoPeca2;
		int qtdPeca1, qtdPeca2;
		double valorUnitario1, valorUnitario2;
		double valorPagar;
		System.out.print("Codigo Peca 1: ");
		codigoPeca1 = Integer.parseInt(br.readLine());
		System.out.print("Numero de Pecas 1: ");
		qtdPeca1 = Integer.parseInt(br.readLine());
		System.out.print("Preco Unitario 1: ");
		valorUnitario1 = Double.parseDouble(br.readLine());
		
		System.out.print("Codigo Peca 2: ");
		codigoPeca2 = Integer.parseInt(br.readLine());
		System.out.print("Numero de Pecas 2: ");
		qtdPeca2 = Integer.parseInt(br.readLine());
		System.out.print("Preco Unitario 2: ");
		valorUnitario2 = Double.parseDouble(br.readLine());
		
		valorPagar = (qtdPeca1*valorUnitario1) + (qtdPeca2*valorUnitario2);
		
		System.out.printf("Total a pagar: %.2f", valorPagar);
		
		
		
	}

}
