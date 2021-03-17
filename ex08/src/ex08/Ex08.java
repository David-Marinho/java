package ex08;
import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] num = new int[5];
        int[] pares = new int[5];
        int j = 0, cont = 0, i = 0;
        
        while(i < 5){
            System.out.print("digite um numero: ");
            num[i] = ler.nextInt();
            
            if(num[i] % 2 == 0){
                pares[j] = num[i];
                j++;
                cont++;
            }
            i++;
        }
        System.out.printf("o numero total de pares é igual a: %d \n", cont);
        
        for(i = 0; i < cont; i++){
            System.out.println(pares[i]);
    }   }
}
