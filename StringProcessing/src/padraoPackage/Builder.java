package padraoPackage;

public class Builder {
	public static void main(String[] args) {
		//Inicializa a Array dos emails
		String[] emails = {"ana@dominio.com", "beto@dominio.com", "carla@dominio.com", "daniel@dominio.com"};
		//Inicializa a String Builder
		StringBuilder lista = new StringBuilder();
		
		//Usa o metodo for para anexar os emails a lista
	for(String email : emails) {	
		lista.append(email);
		lista.append(";");
	}
	
	System.out.println(lista);
	
		//Usa o if para deletar o ; a mais
	if( lista.length() > 0 ) {
		lista.deleteCharAt(lista.length() - 1);
	}
	
	System.out.println("------------------");
	
	//Transforma a StringBuilder em String 
	String emai = lista.toString();
	System.out.println("Lista de emails final: " + emai);
	}
}

