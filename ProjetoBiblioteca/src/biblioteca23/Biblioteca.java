package biblioteca23;
import java.util.ArrayList;


public class Biblioteca {
	//Instanciando a arrayList
	ArrayList<Livro> livros = new ArrayList<>();

//Usando this para destinar o objeto
public Biblioteca() {
	this.livros = new ArrayList<>();
}

//Metodo para adicionar livros a ArrayList
public void adicionarLivros(Livro livro) {
	this.livros.add(livro);

}

//Metodo para listar livros da array
public void listarLivros() {
	System.out.println("Livros na biblioteca");
for(Livro livros : this.livros) {
	System.out.println(livros.getInfo());
}
}

}
