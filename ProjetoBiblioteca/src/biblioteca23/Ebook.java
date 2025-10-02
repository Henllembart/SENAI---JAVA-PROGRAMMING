package biblioteca23;

//Criação da subclasse livro
public class Ebook extends Livro{
	String formato;
	
//Construtor do ebook
public Ebook(String autor, String titulo,String formato) {
	super(titulo, autor);
	this.formato = formato;
}

public String getInfo() {
	return "Titulo: " + this.titulo + ", Autor " + this.autor + ", Formato " + this.formato;
}
}
