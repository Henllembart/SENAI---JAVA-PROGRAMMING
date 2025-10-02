package modelagem;

public final class Bicicleta implements Veiculo {
	//Variavel da classe bicicleta
	private double custoDeManutencaoPorKm;


	//Construtor da classe Bicicleta
public Bicicleta(double custoDeManutencaoPorKm) {
	this.custoDeManutencaoPorKm = custoDeManutencaoPorKm;
}

//Sobrescrever metodo calcular custo para a bicicleta
@Override
public double calcularCustoPorKm(double distancia) {
	double valorDaManutencao = custoDeManutencaoPorKm * distancia;
	double valorArredondado = Math.round(valorDaManutencao);
	return valorArredondado;
}

//Sobrescrever metodo get tipo para a bicicleta
@Override
public String getTipo() {
	return "Bicicleta";
}
}
