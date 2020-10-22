package exercicioLogicaProgramacao3;

public class Conversor {

	public static double ConverterCparaF(double celcius) {
			
			double calculo = 0;
			calculo = (celcius * 1.8) + 32;
			return calculo;
	}
	public static double ConverterFparaC(double Farenheit) {
			
			double calculo = 0;
			calculo = (Farenheit - 32) / 1.8;
			return calculo;
		}

}
