package exercicioLogicaProgramacao3;
import java.util.Scanner;

public class exercicioLogicaProgramacao3 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		Conversor conversor = new Conversor();
		
		double graus;
		int opcao;
		
		System.out.println("Digite o tipo de conversão : \n 1- Celcius para Farenheit \n 2- Farenheit para Celcius.");
		opcao = leitura.nextInt();
		 
		System.out.println("Digite o grau:");
		graus = leitura.nextDouble();
		
		if (opcao == 1) {
			System.out.println(conversor.ConverterCparaF(graus)+ " F");
		}
		
		else if (opcao == 2) {
			System.out.println(conversor.ConverterFparaC(graus)+ " C");
		}

	}
}







