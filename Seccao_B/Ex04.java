import java.util.Scanner;
public class Ex04{
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		int horaInicial;
		int horaFinal;
		int duracao;

		System.out.print("Hora Inicial: ");
		horaInicial = key.nextInt();
		System.out.print("Hora Final: ");
		horaFinal = key.nextInt();

		if(horaInicial > horaFinal){
			duracao = 24 - (horaInicial - horaFinal);
			System.out.println("O jogo durou: "+duracao+" horas!");
		}
		else if(horaFinal > horaInicial){
			duracao = horaFinal - horaInicial;
			System.out.println("O jodo durou: "+duracao+" horas!");
		}
		else{
			System.out.println("O jogo durou 24 horas!");
		}
		key.close();
	}
}