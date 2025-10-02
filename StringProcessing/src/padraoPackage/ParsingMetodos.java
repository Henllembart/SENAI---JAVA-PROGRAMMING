package padraoPackage;

public class ParsingMetodos {
	public static void main(String[] args) {
		//Variavel registro
		String registro =  "2024001;Joao Silva;Java Programming;9.5";
		
		//Metodo para imprimir o registro original
		System.out.println("Registro inicial: " + registro + "\n");
		//Array criada para armazenar o split da String
		String[] dados = registro.split(";");
		
		//Uso do if para imprimir tudo de uma vez
		if(dados.length == 4) {
			//O indice indica a posicao de determinado dado
			System.out.println("Matricula: " + dados[0]);
			System.out.println("Nome: " + dados[1].toUpperCase());
			System.out.println("Curso: " + dados[2]);
			System.out.println("Nota: " + dados[3]);
		}
		else {
			System.out.println("ERRO!");//Mensagem de erro caso o tamanho seja maior ou menor que os dados
		}
		
	}
}
