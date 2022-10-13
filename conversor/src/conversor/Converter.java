package conversor;

public class Converter {
	public static double conversor(double dolar, double qtd_dolar) {
		double res = dolar * qtd_dolar;
		res += res * 0.06;
		return res;
	}
}
