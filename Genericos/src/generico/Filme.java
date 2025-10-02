package generico;

public class Filme {
	//Variaveis da classe filme
	String titulo;
	Genero genero;
	
//Construtor da classe filme
public Filme(String titulo, Genero genero) {
	this.titulo = titulo;
	this.genero = genero;
}

//Metodo para obter informacoes do filme
public String obterInfo() {
	return "Titulo " + this.titulo + ", Genero " + this.genero;
}


}

