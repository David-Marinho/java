package ex06;
import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] impares = new int[10];
        int num, i = 0;
        
        while(i < 10){
            System.out.print("digite um numero: ");
            num = ler.nextInt();
            
            if(num%2 != 0){
                System.out.println("numero impar salvo");
                impares[i] = num;
                i++;
            }
            else{
                System.out.println("nao é um numero impar, por favor, tente novamente");
            }
        }
        for(i = 0; i < 10; i++){
            System.out.println(impares[i]);
        }
        
    }
    
}
