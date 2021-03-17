
package ex01;
import java.util.Scanner;

public class Ex01 {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        int f, c;
        
        System.out.print("digite a temperatura em fahrenheit: ");
        f = ler.nextInt();
        
        c = (5*(f-32)/9);
        
        System.out.printf("%dº fahrenheit é igual a %dº celsius \n", f, c);
    }
    
}
