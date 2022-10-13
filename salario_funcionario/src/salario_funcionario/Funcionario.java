package salario_funcionario;

public class Funcionario {
	String nome; 
	double salarioBruto;
	double taxa; 
	
	public double salarioLiquido() {
		return salarioBruto-taxa; 
		
	}
	
	public void aumentoSalario(double perc) {
		this.salarioBruto += this.salarioBruto * perc/100;
	}
	
	void resumo() {
		System.out.println("Funcionário: "+ this.nome + ", $" + String.format("%.2f", salarioLiquido()));
	}
	
}
