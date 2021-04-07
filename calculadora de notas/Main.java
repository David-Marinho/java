import java.util.Scanner;
public class Main
{
    public static final double min = 6.0;
    
    public static void notas(double n1, double n2, String nome){
        double total = 0;
        total = (n1+n2)/2;
        if(total < min){
            System.out.printf("o aluno %s foi reprovado com nota: %.2f%n", nome, total);
        }
        else{
            System.out.printf("o aluno %s foi aprovado com nota: %.2f%n", nome, total);
        }
    }
	public static void main(String[] args) {
		double n1 = 0;
		double n2 = 0;
		String nome;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("digite o nome do aluno: ");
		nome = ler.next();
		
		System.out.print("digite a primeira nota do aluno: ");
		n1 = ler.nextDouble();

        System.out.print("digite a segunda nota do aluno: ");
        n2 = ler.nextDouble();

		notas(n1, n2, nome);
	}
}