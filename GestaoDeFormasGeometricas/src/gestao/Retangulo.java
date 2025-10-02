package gestao;

public final class Retangulo implements Forma {//Classe implementa classe forma
	private final double largura;
	private final double altura;
	
//Construtor
public Retangulo(double altura, double largura) {
	this.altura = altura;
	this.largura = largura;
	}

//Metodo para sobrescrever o metodo 
@Override
//Metodo para pegar a Area do retangulo
public double getArea() {
	return largura*altura;
	}
@Override
//Metodo para pegar o perimetro do retangulo
public double getPerimetro() {
	return 2*(largura+altura);
}
}
