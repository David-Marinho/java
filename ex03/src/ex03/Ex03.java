package ex03;
import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
      int valor1, valor2, total;
      
      System.out.print("digite o primeiro valor: ");
      valor1 = ler.nextInt();
      
      System.out.print("digite o segundo numero: ");
      valor2 = ler.nextInt();
      
      total = valor1 + valor2;
      
      System.out.printf("a soma de %d + %d é igual a %d \n", valor1, valor2, total);
    }
    
}
