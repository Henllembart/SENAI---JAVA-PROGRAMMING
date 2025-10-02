package padraoPackage;

public class Inversao {
	public static void main(String[] args) {
		//Variavel texto 
		String texto = "Java";
		
		//If usado para validar o codigo, nao permitindo Strings vazias ou com um caractere
	if(texto.isEmpty() || texto.length() == 1 ) {
		System.out.println(texto);
		}
	else {
		
		//Uso do substring para pegar a continuação apos o 2 caractere e o char at para pegar o primeiro caractere
		String invertida = texto.substring(1) + texto.charAt(0);
		System.out.println(invertida);
		
	}
	
	}
	}

