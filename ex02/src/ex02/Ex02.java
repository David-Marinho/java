//elabore um algoritmo que, dada a idade de um nadador. Classifique
//em uma das seguintes categorias:
//infantil A <= 7
//infatil B <= 10
//juvenil A <= 13
//juvenil B <= 17
//senior <= 25
//se for maior que 25 exibir a mensagem: "idade fora da faixa etaria"

package ex02;
import java.util.Scanner;

public class Ex02 {
    public static final int INFANTIL_A = 7;
    public static final int INFANTIL_B = 10;
    public static final int JUVENIL_A = 13;
    public static final int JUVENIL_B = 17;
    public static final int SENIOR = 25;

    public static void confereIdade(int idade){
        if(idade <= INFANTIL_A){
            System.out.println("voce faz parte do grupo infantil A");        
        }
        
        else if(idade <= INFANTIL_B){
            System.out.println("voce faz parte do grupo infantil B");        
        }
        
        else if(idade <= JUVENIL_A){
            System.out.println("voce faz parte do grupo juvenil A");        
        }
        
        else if(idade <= JUVENIL_B){
            System.out.println("voce faz parte do grupo juvenil B");        
        }
        
        else if(idade <= SENIOR){
            System.out.println("voce faz parte do grupo anos senior");        
        }
        
        else{
            System.out.println("idade fora da faixa etaria");        
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int idade;
        
        System.out.print("ola! qual a sua idade? ");
        idade = ler.nextInt();
        
        confereIdade(idade);
    }
}
