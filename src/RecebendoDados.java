import java.util.Scanner;

public class RecebendoDados {

	public static void main(String[] args) {
		// A linha abaixo cria um Scanner. O scanner � usada para
		// lermos os dados que o usu�rio digitar pelo teclado
		
		Scanner leitor = new Scanner(System.in);
		
		//A linha abaixo cria uma vari�vel (espa�o na mem�ria) para guardarmos um dados. 
		//Nesse caso, o nome do usu�rio
		String nomeUsuario;
		
		System.out.println("Por favor, escreva seu nome:");
		
		// .next recebe a digita��o que for escrita no teclado
		// "=" significa atribui��o no caso de vari�veis
		nomeUsuario = leitor.next();
		System.out.println("Obrigado por utilizar o programa, " + nomeUsuario);
		
		//Comando close() para fecha o Scanner ap�s o uso
		
		leitor.close();
	}

}
