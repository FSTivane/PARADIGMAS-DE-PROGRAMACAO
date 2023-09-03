import java.util.Scanner;
public class Ex06{
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		double pi = 3.14159;
		double a, b, c;
		double raioCirculo;
		double areaTrianguloRetangulo;
		double areTrapezio;
		double areaQuadrado;
		double areaRetangulo;

		System.out.print("Digite o valor de A: ");
		a = key.nextDouble();

		System.out.print("Digite o valor de B: ");
		b = key.nextDouble();

		System.out.print("Digite o valor de C: ");
		c = key.nextDouble();

		areaTrianguloRetangulo = (a*c)/2;
		raioCirculo = pi * Math.pow(c, 2);
		areTrapezio = ((a+b)*c)/2;
		areaQuadrado = Math.pow(b, 2);
		areaRetangulo = a*b;

		System.out.println("A area do Triangulo rectangulo e igual a: "+areaTrianguloRetangulo);
		System.out.println("A area do Circulo e igual a: "+raioCirculo);
		System.out.println("A area do Trapezio e igual a: "+areTrapezio);
		System.out.println("A area do Quadrado e igual a: "+areaQuadrado);
		System.out.println("A area do Rectangulo e igual a: "+areaRetangulo);

	}
}