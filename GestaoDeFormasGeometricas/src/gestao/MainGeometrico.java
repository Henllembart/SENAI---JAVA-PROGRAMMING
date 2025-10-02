package gestao;
import java.util.ArrayList;
import java.util.List;

public class MainGeometrico {
	public static void main(String[] args) {
	
	//Instanciando o objeto List e adicionando itens 
	List<Forma>formas = new ArrayList<>();
	formas.add(new Circulo(7));
	formas.add(new Retangulo(2.0, 5.0 ));
	
	//Usando o Loop for para fazer os calculos
	for(Forma forma : formas) {
		System.out.println("_--------------_");
		System.out.println("Area: " + forma.getArea());
		System.out.println("Perimetro: " + forma.getPerimetro());
			
		}
	}
}
