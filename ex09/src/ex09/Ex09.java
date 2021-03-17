package ex09;
import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int idade;
        
        System.out.print("ola! qual a sua idade? ");
        idade = ler.nextInt();
        
        if(idade <= 7){
            System.out.println("voce faz parte do grupo infantil A");        
        }
        
        if(idade <= 10){
            System.out.println("voce faz parte do grupoi nfantil B");        
        }
        
        if(idade <= 13){
            System.out.println("voce faz parte do grupo juvenil A");        
        }
        
        if(idade <= 17){
            System.out.println("voce faz parte do grupo juvenil B");        
        }
        
        if(idade <= 25){
            System.out.println("voce faz parte do grupo anos senior");        
        }
        
        if(idade > 25){
            System.out.println("idade fora da faixa etaria");        
        }
    }
    
}
