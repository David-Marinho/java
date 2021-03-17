package ex04;
import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
            int valor1, valor2, soma, sub, mult, div;
            Scanner ler = new Scanner(System.in);
            
            System.out.print("digite o primeiro valor: ");
            valor1 = ler.nextInt();
            
            System.out.print("digite o segundo valor: ");
            valor2 = ler.nextInt();
            
            soma = valor1 + valor2;
            sub = valor1 - valor2;
            mult = valor1 * valor2;
            div = valor1 / valor2;
            
            System.out.printf("a soma é igual a: %d \n", soma);
            System.out.printf("a subtraçao é igual a: %d \n", sub );
            System.out.printf("a multiblicaçao é igual a: %d \n", mult );
            System.out.printf("a divisao é igual a: %d \n", div );
                
    }
    
}
