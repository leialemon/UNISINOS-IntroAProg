public class Computador{
	public String marca;
	public int velocidade;
	public int anoFabricacao;
	public boolean novo;

	public Computador(String marca, int velocidade, int anoFabricacao, boolean novo){
		this.marca = marca;
		this.velocidade = velocidade;
		this.anoFabricacao = anoFabricacao;
		this.novo = novo;
	}

	public void setMarca(String marca){
		this.marca = marca;
	}

	public String getMarca(){
		return this.marca;
	}

	public void setVelocidade(int velocidade){
		this.velocidade = velocidade;
	}

	public int getVelocidade(){
		return this.velocidade;
	}

	public void setAnoFabricacao(int ano){
		this.anoFabricacao = ano;
	}

	public int getAnoFabricacao(){
		return this.anoFabricacao;
	}

	public void setNovo(boolean novo){
		this.novo = novo;
	}

	public boolean getNovo(){
		return this.novo;
	}
}
