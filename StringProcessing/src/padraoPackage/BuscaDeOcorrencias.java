package padraoPackage;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class BuscaDeOcorrencias {
		public static void main(String[] args) {
		//Declarando uma variavel para o texto
		String texto = "Este eh um exercicio sobre Java e Expressoes Regulares em programacao.";
		//Declarando uma variavel para o meta caractere
		String regex = "\\w{5,}";
		
		//Criando o Pattern para podermos manter o padrao de busca
		Pattern padrao = Pattern.compile(regex);
		//Usando o matcher para buscar no texto com base no padrao
		Matcher match = padrao.matcher(texto);
		
		
		System.out.println("Texto que estamos analisando: " + texto);
	
		
	int contador = 0;//Uso do contador para termos noção de quantas palavras foram achadas no loop

	//Uso do while para manter o loop para procura
	while(match.find()) {
		System.out.println("-" + match.group());
		contador++;
	}
		System.out.println("\nTotal de palavras encontradas: " + contador);
		
		}
}