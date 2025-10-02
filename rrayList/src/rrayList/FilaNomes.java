package rrayList;
import java.util.ArrayList;

public class FilaNomes {
	public static void main(String[] args) {
		
		//Instanciando o objeto arrayList
		ArrayList<String> nomesAlunos = new ArrayList<>();
		
		//Adicionando os nomes a arrayList
		nomesAlunos.add("Joao Pedro");
		nomesAlunos.add("Francisco");
		nomesAlunos.add("Rafael");
		
		//Imprimindo a lista e o terceiro nome.
		System.out.println("Lista inicial " + nomesAlunos);
		System.out.println("O terceiro nome da lista é " + nomesAlunos.get(2));
		System.out.println("Iremos remover um nome");
		
		//Metodo para remover o Francisco da Array
		nomesAlunos.remove("Francisco");
		System.out.println("A lista agora esta: " + nomesAlunos);
		
		System.out.println(nomesAlunos.indexOf("Joao Pedro"));
		
	}
}
