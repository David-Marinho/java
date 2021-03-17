
package ex02;
import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int num;
        
        System.out.print("digite um numero: ");
        num = ler.nextInt();
        
        System.out.printf("dados sobre o numero %d: \n", num);
        if(num%2 == 0){
            System.out.print("é par \n");
        }
        else{
            System.out.print("nao é par \n");
        }
        
        if(num >= 0){
            System.out.print("positivo \n");
        }
        else{
            System.out.print("negativo \n");
        }
            
    }
    
}
