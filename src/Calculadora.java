import java.util.Scanner;

public class Calculadora {

	/* + SOMAR
	 * - SUBTRAIR
	 * / DIVIDIR
	 * * MULTIPLICAR 
	*/
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double primeiroValor;
		double segundoValor;
		double soma, subtrair, dividir, multiplicar;
		
		System.out.println("Por favor, digite um valor: ");
		primeiroValor = leitor.nextDouble();
		
		System.out.println("Por favor, digite o segundo valor: ");
		segundoValor = leitor.nextDouble();
	
		soma = primeiroValor + segundoValor;
		System.out.println("A soma entre os dois valores é " + soma);
	
		subtrair = primeiroValor - segundoValor;
		System.out.println("A subtração entre os dois valores é: " + subtrair);

		dividir = primeiroValor / segundoValor;
		System.out.println("A divisão entre os dois valores é: " + dividir);

		multiplicar = primeiroValor * segundoValor;
		System.out.println("A multiplicação entre os dois valores é: " + multiplicar);
	}

}
