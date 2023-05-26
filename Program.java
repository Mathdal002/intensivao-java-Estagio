import java.util.Locale;

public class Program {
	public static void main(String[] args) {
		// imprimir mensagem 
		System.out.println("Ol� Mundo");
		System.out.println("Bom dia ");
		
		// Para escrever o conte�do de uma vari�vel de algum tipo b�sico
		int y = 32;
		System.out.println(y);
		
		// Para escrever o conte�do de uma vari�vel com ponto flutuante 
		double x = 10.35784;
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		
		// Para concatenar v�rios elementos em um mesmo comando de escrita
		
		System.out.println("Resultado = " + x + " METROS");
		
		// Para concatenar v�rios elementos em um mesmo comando de escrita
		System.out.printf("RESULTADO = %.2f metros%n", x);
		
		// Para concatenar v�rios elementos em um mesmo comando de escrita com muitos elementos
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}
}
