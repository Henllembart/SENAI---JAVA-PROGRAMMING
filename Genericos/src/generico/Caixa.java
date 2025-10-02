package generico;

//Declarando a classe caixa que aceite um tipo generico
public class Caixa<T> {
	private T item;

//Metodo para adicionar itens na Caixa
public void adicionar (T item) {
	this.item = item;
}

//Metodo para obter o que tem dentro da caixa
public T obterT() {
	return this.item;
}

}
