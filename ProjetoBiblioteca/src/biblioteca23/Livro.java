package biblioteca23;


public class Livro {
	//Variaveis da classe livro
	String titulo;
	String autor;

	//Construtor classe livro
public Livro(String titulo, String autor) {
	this.autor = autor;
	this.titulo = titulo;
}

//Metodo para conseguir pegar as informaçoes do livro
public String getInfo() {
	return "Autor: " + this.autor + ", Titulo: " + this.titulo;
}
}

