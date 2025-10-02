package padraoPackage;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegularExpressions {
	//Criando o metodo testar codigo
	static void testarCodigo(String codigo, Pattern padrao) {
		
		//Criando o matcher e trazendo um boolean para validar ele
		Matcher matcher = padrao.matcher(codigo);
		boolean valido = matcher.matches();
		System.out.printf("Codigo '%s': %s%n", codigo, valido ? "VALIDO" : "INVALIDO");
	}
	
	public static void main(String[] args) {
		//Criando a variavel e instanciando o Pattern
		String regex = "123456";
		Pattern padrao = Pattern.compile(regex);
		
		//Variaveis de diferentes codigos
	    String codigo1 = "123456"; 
        String codigo2 = "12345";  
        String codigo3 = "12345a"; 
        String codigo4 = "1234567"; 
    
        //Chamando o metodo testar codigo para executar.
        testarCodigo(codigo1, padrao);
        testarCodigo(codigo2, padrao);
        testarCodigo(codigo3, padrao);
        testarCodigo(codigo4, padrao);
	}
}
