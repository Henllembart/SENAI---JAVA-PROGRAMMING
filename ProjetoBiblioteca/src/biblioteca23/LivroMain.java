package biblioteca23;

public class LivroMain {
	public static void main(String[] args) {
	
	//Instanciando os objetos
	Biblioteca biblioteca1 = new Biblioteca();
	Ebook livro1 = new Ebook("Francisco","Java Programming", "PDF");
	LivroFisico livro2 = new LivroFisico("Dom Casmurro", "Machado de Assis", 232);
	
	//Usando os metodos para adicionar os livros na biblioteca
	biblioteca1.adicionarLivros(livro1);
	biblioteca1.adicionarLivros(livro2);
	
	//Metodo para listar os livros da biblioteca
	biblioteca1.listarLivros();
	}
}
