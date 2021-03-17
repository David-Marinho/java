package ex07;
import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] valores = new int[10];
        
        for(int i = 0; i < 10; i++){
            System.out.print("digite um valor: ");
            valores[i] = ler.nextInt();
        }
        System.out.println("os valores selecionados foram:");
        
        for (int i = 5; i < 10; i++){
            System.out.println(valores[i]);
        }
        
        for(int i = 0; i<5; i++){
            System.out.println(valores[i]);
        }
    }
    
}
