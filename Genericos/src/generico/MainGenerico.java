package generico;
import java.util.List;
import java.util.ArrayList;

public class MainGenerico {
	public static void imprimirLista(List<? extends Filme> lista) {//Metodo para imprimir lista de filmes com um curinga, onde é uma subclasse de filme
		//Loop para imprimir a lista
		for(Filme filme : lista) {
			System.out.println(filme.obterInfo());
		}
	}
	public static void main(String[] args) {
		//Instanciando a classe caixa com uso do tipo String e imprimindo o que ha nela
		Caixa<String> caixaString = new Caixa<>();
		caixaString.adicionar("Java para iniciantes");
		System.out.println("Conteudo da caixaString: " + caixaString.obterT());
		
		//Instanciando a classe caixa com o uso do tipo Integer(int) e imprimindo o que ha nela
		Caixa<Integer> caixaInt = new Caixa<>();
		caixaInt.adicionar(123);
		System.out.println("Conteudo da caixaInt: " + caixaInt.obterT());
		
		//Usando uma list com o objeto filme dentro, adicionando itens e usando o metodo imprimirLista para mostrar o que tem nela
		List<Filme> filmes = new ArrayList<>();
		filmes.add(new Filme("Bad boys", Genero.ACAO));
		filmes.add(new Filme("Gente grande", Genero.COMEDIA));
		imprimirLista(filmes);
		
		
	}

}
