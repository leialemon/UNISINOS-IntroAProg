public class Cliente{

	public String nome;
	public int idade;
	public String email;
	public String senha;

	public Cliente(String nome, int idade, String email, String senha){
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.senha = senha;
	}

	public void imprimeInformacoes(){
		String output = """
			Informações do Cliente
			Nome: %s
			Idade: %d
			Email: %s
			Senha: %s
			""".formatted(this.nome, this.idade, this.email, this.senha);
		
		System.out.println(output);
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public String getNome(){
		return this.nome;
	}

	public void setIdade(int idade){
		this.idade = idade;
	}

	public int getIdade(){
		return this.idade;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return this.email;
	}

	public void setSenha(String senha){
		this.senha = senha;
	}

	public String getSenha(){
		return this.senha;
	}

}
