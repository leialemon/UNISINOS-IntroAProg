public class Produto{

	public String nome;
	public double valor;
	public String descricao;
	public int quantidade;

	public Produto(String nome, double valor, String descricao, int quantidade){
		this.nome = nome;
		this.valor = valor;
		this.descricao = descricao;
		this.quantidade = quantidade;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public String getNome(){
		return this.nome;
	}

	public void setValor(double valor){
		this.valor = valor;
	}

	public double getValor(){
		return this.valor;
	}

	public void setDescricao(String descricao){
		this.descricao = descricao;
	}

	public String getDescricao(){
		return this.descricao;
	}

	public void setQuantidade(int quantidade){
		this.quantidade = quantidade;
	}

	public int getQuantidade(){
		return this.quantidade;
	}
}
