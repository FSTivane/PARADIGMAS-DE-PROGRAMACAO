import java.io.*;
public class Ex02 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		final double pi = 3.14159;
		double raio;
		double area;
		
		System.out.print("Enter raio value: ");
		raio = Double.parseDouble(br.readLine());
		
		area = pi * Math.pow(raio, 2);
		System.out.println("");
		System.out.printf("A area do ciculo e: %.2f\n",area);
	}

}