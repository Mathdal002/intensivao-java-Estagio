package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Empregado;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Empregado empregado = new Empregado();
		
		System.out.println("name: ");
		empregado.name = sc.next();
		System.out.println("Salario Bruto: ");
		empregado.salarioBruto = sc.nextDouble();
		System.out.println("Taxa: ");
		empregado.taxa = sc.nextDouble();
		
		System.out.println();
		System.out.println("Empregado: " + empregado);
		System.out.println();
		System.out.print("Qual percentual aumentar salário ? ");
		double porcento = sc.nextDouble();
		empregado.incrementoSalario(porcento);
		
		System.out.println();
		System.out.println("Updated data: " + empregado);
	}

}
