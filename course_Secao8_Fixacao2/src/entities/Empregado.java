package entities;

public class Empregado {
	
	public String name;
	public double salarioBruto;
	public double taxa;
	
	public double salarioLiquido() {
		return salarioBruto - taxa;
	}
	
	public void incrementoSalario(double porcento) {
		salarioBruto += salarioBruto * porcento /100.0 ;
	}
	
	public String toString() {
		return name + ",$ " + String.format("%.2f", salarioLiquido());	
	}


}
