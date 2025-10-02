package gestao;

public final class Circulo implements Forma{ //Classe que implementa a da forma.
	private final double raio;

//Construtor do circulo
public Circulo(double raio) {
	this.raio = raio;
}

//Metodo para pegar a Area do Circulo
@Override
public double getArea() {
	double valorTotal = Math.PI*Math.pow(raio, 2);
	double arredondado = Math.round(valorTotal);//Metodo para arredondar valor
	return arredondado;
}

//Metodo para pegar o perimetro do circulo
@Override
public double getPerimetro() {
	double valorP = 2*Math.PI*raio;
	double arredP = Math.round(valorP);
	return arredP;
	}
}
