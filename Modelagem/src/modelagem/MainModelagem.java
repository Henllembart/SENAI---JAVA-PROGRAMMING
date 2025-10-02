package modelagem;

public class MainModelagem {
	public static void main(String[] args) {
		//Instanciando as classes
		Veiculo carro1 = new Carro(11 , 6.22);
		Veiculo bicicleta1 = new Bicicleta(0.25);
	
	//Metodos de impressao para o Carro, usando o calcular custo e o get tipo
	System.out.println("Ao andar 100km, o custo por KM sera de R$" + carro1.calcularCustoPorKm(100));
	System.out.println("O tipo do veiculo é: " + carro1.getTipo());
	
	System.out.println("\nAo andar 5km, o custo da manutencao é R$" + bicicleta1.calcularCustoPorKm(5));//Retorna 1.0 pois é o valor arredondado
	System.out.println("O tipo do veiculo é: " + bicicleta1.getTipo());
	
	}
}
