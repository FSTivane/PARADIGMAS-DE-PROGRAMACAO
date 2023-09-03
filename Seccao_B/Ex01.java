import java.io.*;
public class Ex01 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number;
		System.out.print("Digite um numero: ");
		number = Integer.parseInt(br.readLine());

		if(number > 0){
			System.out.println("O numero digitado e positivo!");
		}
		else{
			System.out.println("O numero digitado e negativo!");
		}
	}
}