package ex05;
import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome;
        double salario, sfinal, vendas;
        
        System.out.print("qual o seu nome? ");
        nome = ler.nextLine();
        
        System.out.print("quanto voce recebe? ");
        salario = ler.nextDouble();
        
        System.out.print("quanto voce vendeu esse mes? (em R#) ");
        vendas = ler.nextDouble();
        
        sfinal =  (salario + (vendas * 0.15));
        
        System.out.printf("funcionario: %s \n", nome);
        System.out.printf("salario base: %2f \n", salario);
        System.out.printf("total de vendas (em R$): %2f \n", vendas);
        System.out.printf("salario final: %2f \n", sfinal);
    }
    
}
