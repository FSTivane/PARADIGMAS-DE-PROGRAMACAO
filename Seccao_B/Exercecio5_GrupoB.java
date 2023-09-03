
import java.util.Scanner;

public class Exercecio5_GrupoB {
    public static void main(String [] args){
        Scanner t = new Scanner(System.in);
        
        String codigo;
        int quant;
        double preco;
        
        System.out.println("Insira o codigo do item: ");
        codigo = t.next();
        
         System.out.println("Insira a quantidade deste item: ");
        quant = t.nextInt();
        
         System.out.println("Insira o preco deste item: ");
        preco = t.nextDouble();
        
        double valor = quant * preco;
         System.out.print("Para o item: "+codigo);
         System.out.printf(" o valor de conta a pagar e': %.2f ", valor);
        
    }
}
