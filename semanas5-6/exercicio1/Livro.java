public class Livro {


	public String titulo;
	public String autor;
	public int anoPublicacao;
	public double preco;
	public int quantidadePaginas;

	public Livro(String titulo, String autor, int anoPublicacao, double preco, int quantidadePaginas){
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
		this.preco = preco;
		this.quantidadePaginas = quantidadePaginas;
	}

	public float calcularPrecoPorPagina(){
		float ppp = (float) preco / quantidadePaginas;
		return ppp;
	}
	
	public void imprimeInformacoes(){
		String informacoes = """
				Informações sobre o Livro
				Título: %s
				Autor: %s
				Ano de Publicação: %d
				Preço: %.2f
				Quantidade de Páginas: %d
				""".formatted(this.titulo, this.autor, this.anoPublicacao, this.preco, this.quantidadePaginas);
		System.out.println(informacoes);
		
	}

	public void setTitulo(String titulo){
		this.titulo = titulo;
	}

	public String getTitulo(){
		return this.titulo;
	}

	public void setAutor(String autor){
		this.autor = autor;
	}

	public String getAutor(){
		return this.autor;
	}

	public void setAnoPublicacao(int anoPublicacao){
		this.anoPublicacao = anoPublicacao;
	}

	public int getAnoPublicacao(){
		return this.anoPublicacao;
	}

	public void setPreco(double preco){
		this.preco = preco;
	}

	public double getPreco(){
		return this.preco;
	}

	public void setQuantidadePaginas(int quantidadePaginas){
		this.quantidadePaginas = quantidadePaginas;
	}

	public int getQuantidadePaginas()
	{
		return this.quantidadePaginas;
	}

}
