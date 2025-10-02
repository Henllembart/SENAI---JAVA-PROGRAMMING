package padraoPackage;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SepararData {
	public static void main(String[] args) {
		//Variavel String data com uma data
		String data = "22/08/2007";
		//Uso do regex para o padrao
		String regex = "(\\d{2})/(\\d{2})/(\\d{4})";
		//Pattern para definir o padrao
		Pattern padrao = Pattern.compile(regex);
		//Matcher para procurar esse padrao em determinado texto
		Matcher match = padrao.matcher(data);
		
		//Se o matcher achar no texto, executa este bloco.
		if(match.find()) {
			String dataCompleta = match.group(0);
			String dia = match.group(1);
			String mes = match.group(2);
			String ano = match.group(3);
			
			System.out.println("Data completa: " + dataCompleta);
			System.out.println("Dia: " + dia);
			System.out.println("Mes: " + mes);
			System.out.println("Ano: " + ano);
		}
		//Caso nao seja encontrado, executa este codigo
		else {
			System.out.println("Data nao foi encontrada");
		}
	}
}
