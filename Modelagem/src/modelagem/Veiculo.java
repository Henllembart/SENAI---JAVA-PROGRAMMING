package modelagem;

public interface Veiculo {
    
	//Metodos pré implementados para as diferentes classes, por isso o uso do Interface
	double calcularCustoPorKm(double distancia);
    String getTipo();
}
