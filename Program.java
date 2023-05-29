
public class Program {
	public static void main(String[] args) {
	 // A = Math.squart(x); -> Variável A recebe a raiz quadrada de x -> sqrt = raiz quadrada
	 // A = Math.pow(x,y); -> Variável A recebe o resultado de x elevado a y -> pow = ponteciação
     // A = Math.abs(x); -> Variável A recebe o valor absoluto de x -> abs = valor absoluto
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		double a, b, c;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C);
		
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);
		
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);
		
		// formula de baskara
		double delta, x1, x2;
		a = x;
		b = y;
		c = z;
		
		delta = Math.pow(b, 2.0) - 4*a*c;
		x1 = (-b + Math.sqrt(delta)) / (2.0*a);
		x2 = (-b - Math.sqrt(delta)) / (2.0*a);
		
		System.out.println("delta = " + delta);
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);
	}
}
