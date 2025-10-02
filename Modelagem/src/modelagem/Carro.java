package modelagem;

public final class Carro implements Veiculo {
	
	//Variaveis da classe Carro
	private double consumoPorLitro;
	private double precoCombustivelPorLitro;


//Construtor classe Carro
public Carro(double consumoPorLitro, double precoCombustivelPorLitro) {
	this.consumoPorLitro = consumoPorLitro;
	this.precoCombustivelPorLitro = precoCombustivelPorLitro;
}

//Sobrescrever o metodo calcular custo 
@Override
public double calcularCustoPorKm(double distancia) {
	
	double valorTotal = (distancia/consumoPorLitro)* precoCombustivelPorLitro;
	double valorArredondado = Math.round(valorTotal);//Uso do math para arredondar o valor
	return valorArredondado;
}

//Sobrescrever metodo get tipo
@Override
public String getTipo() {
	return "Carro";
}
}



