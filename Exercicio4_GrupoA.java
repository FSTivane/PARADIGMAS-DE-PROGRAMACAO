//Exercicio 4 do grupo A

import java.util.Scanner;

public class Exercicio4_GrupoA { 
    public static void main(String [] args){
        String numFunc;
        int quantHorasTrab;
        double valorHora = 150;
        double salario;
        
        Scanner t = new Scanner(System.in);
        
        System.out.println("Insira o numero do Funcionario: ");
        numFunc = t.next();
        
        System.out.println("Insira a quantidade de horas trabalhada: ");
        quantHorasTrab = t.nextInt();
        
        salario = quantHorasTrab * valorHora;
        
        System.out.print("O funcionario: "+numFunc);
        System.out.printf("\n Tem o salario de %.2f",salario," meticais");
    }
    
}
