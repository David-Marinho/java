package ex10;
import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int valor, total;
        
        System.out.print("quanto voce depositou? ");
        valor = ler.nextInt();
        
        total = (int) (valor + (valor * 0.70));
        
        System.out.printf("o valor final é de: %d \n", total);
    }
    
}
