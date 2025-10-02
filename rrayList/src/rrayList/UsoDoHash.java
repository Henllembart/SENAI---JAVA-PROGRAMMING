package rrayList;
import java.util.HashSet;
import java.util.Set;

public class UsoDoHash {
	public static void main(String[] args) {
		//Instanciando o HashSet
		Set<String> tarefas = new HashSet<>();
		
	//Metodos para adicionar na Array
	tarefas.add("Java");
	tarefas.add("Dar banho no cachorro");
	tarefas.add("Levar a tia no shopping");
	tarefas.add("Java");
	
	//Metodo de impressao da lista das tarefas, veja que Java aparece apenas uma vez por conta do Hash
	System.out.println("Conjunto de tarefas: " + tarefas);
	
	//Uso do boolean para ver se tem java na lista
	boolean temTarefa = tarefas.contains("Java");
	System.out.println("O conjunto de tarefas tem Java? " + temTarefa);
	
	//Metodo para remover do Array
	tarefas.remove("Dar banho no cachorro");
	
	System.out.println("Lista depois de remover o banho " + tarefas);
	System.out.println("Indice 0 " );
	
	}
}
