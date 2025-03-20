
public class Principal{
	public static void main(String[] args){
		double preco1 = 30.50;
		Livro livro1 = new Livro("titulo", "autor", 1995, preco1, 300);
		livro1.imprimeInformacoes();		
	}

}
