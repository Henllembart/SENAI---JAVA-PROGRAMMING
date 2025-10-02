package biblioteca23;

//Declarando a subclasse da classe Livro
public class LivroFisico extends Livro {
	//Variaveis
	int numeroPaginas;
	
	
	//Construtor
	public LivroFisico(String titulo, String autor, int numeroPaginas) {
		super(titulo, autor);
		this.numeroPaginas = numeroPaginas;
	}

	public String getInfo() {
		return "Titulo: " + this.titulo + ", Autor: " + this.autor + ", Numero de paginas " + this.numeroPaginas;
	}
}
