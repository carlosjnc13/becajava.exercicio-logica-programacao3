package exercicioLogicaProgramacao3;
import java.util.Scanner;

public class exercicioLogicaProgramacao3 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		double graus;
		int opcao;
		
		System.out.println("Digite o tipo de conversão : \n 1- Celcius para Farenheit \n 2- Farenheit para Celcius.");
		opcao = leitura.nextInt();
		 
		System.out.println("Digite o grau:");
		graus = leitura.nextDouble();
		
		if (opcao == 1) {
			System.out.println(ConverterCparaF(graus));
		}
		
		else if (opcao == 2) {
			System.out.println( ConverterFparaC(graus));
		}

	}


	public static double ConverterCparaF(double celcius) {
		
		double calculo = 0;
		calculo = (celcius * 1.8) + 32;
		return calculo;
	}
	
	public static double ConverterFparaC(double Fare) {
		
		double calculo = 0;
		calculo = (Fare - 32) / 1.8;
		return calculo;
	}

}


