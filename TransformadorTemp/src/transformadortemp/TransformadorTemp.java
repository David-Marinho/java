package transformadortemp;
import java.util.Scanner;

public class TransformadorTemp {
   
public static void cal(int inicio, int fim, double num){
        double total = 0;
        char letra = 'A';
        if(inicio == 1 && fim == 2){
            total = num + 273.15;
            letra = 'K';
        }
        
        else if(inicio == 1 && fim == 3){
            total = num * 1.8 + 32;
            letra = 'F';
        }
        
        else if(inicio == 2 && fim == 1){
            total = num - 273.15;
            letra = 'C';
        }
        
        else if(inicio == 2 && fim == 3){
            total = (num - 273.15) * 1.8 + 32;
            letra = 'F';
        }
        
        else if(inicio == 3 && fim == 1){
            total = (num - 32) / 1.8;
            letra = 'C';
        }
        
        else if(inicio == 3 && fim == 2){
            total = (num - 32) * 0.5555555555556 + 273.15;
            letra = 'K';
        }
        
        System.out.printf("o resultado da conversao é: %.2fº %c \n", total, letra);
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int inicio, fim;
        double num;
        
        System.out.println("[1] celsius");
        System.out.println("[2] kelvin");
        System.out.println("[3] Fahrenheit");
        System.out.print("qual desses voce quer converter? ");
        inicio = ler.nextInt();
        
        System.out.print("usando a virgula no lugar do ponto, qual o numero que voce deseja converter? ");
        num = ler.nextDouble();
        
        System.out.println("[1] celsius");
        System.out.println("[2] kelvin");
        System.out.println("[3] Fahrenheit");
        System.out.printf("voce quer converter %.2f para qual temperatura? ", num);
        fim = ler.nextInt();
        
        cal(inicio, fim, num);
    }
    
}
