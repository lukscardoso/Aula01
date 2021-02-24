import java.util.Scanner;

public class RecebendoDados {

	public static void main(String[] args) {
		// A linha abaixo cria um Scanner. O scanner é usada para
		// lermos os dados que o usuário digitar pelo teclado
		
		Scanner leitor = new Scanner(System.in);
		
		//A linha abaixo cria uma variável (espaço na memória) para guardarmos um dados. 
		//Nesse caso, o nome do usuário
		String nomeUsuario;
		
		System.out.println("Por favor, escreva seu nome:");
		
		// .next recebe a digitação que for escrita no teclado
		// "=" significa atribuição no caso de variáveis
		nomeUsuario = leitor.next();
		System.out.println("Obrigado por utilizar o programa, " + nomeUsuario);
		
		//Comando close() para fecha o Scanner após o uso
		
		leitor.close();
	}

}
