
public class Principal{
	public static void main(String[] args){
		Livro livro1 = new Livro("titulo", "autor", 1995, 30.5d, 300);
		livro1.imprimeInformacoes();
	
		Livro livro2 = new Livro("Guerra e Paz", "Tolstoi", 1800, 20.0d, 500);
		livro2.imprimeInformacoes();

		Livro livro3 = new Livro("Mansfield Park", "Jane Austen", 1800, 25.0d, 350);
		livro3.imprimeInformacoes();
		
		Cliente cliente1 = new Cliente("Athos", 35, "athos@3musketeers.com", "14all");
		cliente1.imprimeInformacoes();
		
		Cliente cliente2 = new Cliente("Porthos", 36, "Porthos@3musketeers.com", "14all");
		cliente2.imprimeInformacoes();
		
		Cliente cliente3 = new Cliente("Aramis", 34, "aramis@3musketeers.com", "14all");
		cliente3.imprimeInformacoes();	
	

	}

}
