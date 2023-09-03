import java.io.*;
public class Ex03 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b, c, d;
		int diference;
		
		System.out.print("Enter A value: ");
		a = Integer.parseInt(br.readLine());

		System.out.print("Enter B value: ");
		b = Integer.parseInt(br.readLine());

		System.out.print("Enter C value: ");
		c = Integer.parseInt(br.readLine());

		System.out.print("Enter D value: ");
		d = Integer.parseInt(br.readLine());
		
		diference = a * b - c * d;
		System.out.println("The diference of A and B, C and D is: "+diference);
	}
}
