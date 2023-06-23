package application;

import java.util.Scanner;

import entities.enums.FormaPagamento;

public class Program {
	
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		FormaPagamento formaPagamento = FormaPagamento.Cartao_Credito;
		
		System.out.println("Forma de pagamento selecionada: " + formaPagamento.getNome());
		System.out.println("Código da forma de pagamento: " + formaPagamento.getCodigo());
		
		// Iterando sobre todos os valores do enum
		for(FormaPagamento fp : FormaPagamento.values()) {
			System.out.println(fp.getNome() + " - " + fp.getCodigo());
		}
	}
}
