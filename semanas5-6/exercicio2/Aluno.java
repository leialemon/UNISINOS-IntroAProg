public class Aluno{
	
	public String nome;
	public String matricula;
	public double notaGrauA;
	public double notaGrauB;

	public Aluno(String nome, String matricula, double notaGrauA, double notaGrauB){
	       	this.nome = nome;
	       	this.matricula = matricula;
		this.notaGrauA = notaGrauA;
		this.notaGrauB = notaGrauB;
	}

	public double calculaMediaFinal(){
		return ((this.notaGrauA * 0.33) + (this.notaGrauB * 0.67));
	}

	public void imprimeInfo(){
		String output = """
				Informações da/o Aluna/o
				Nome: %s
				Matrícula: %s
				Nota do grau A: %f
				Nota do grau B: %f
			""".formatted(this.nome, this.matricula, this.notaGrauA, this.notaGrauB);
		System.out.println(output);
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public String getNome(){
		return this.nome;
	}

	public void setMatricula(String matricula){
		this.matricula = matricula;
	}

	public String getMatricula(){
		return this.matricula;
	}

	public void setNotaGrauA(double nota){
		this.notaGrauA = nota;
	}

	public double getNotaGrauA(){
		return this.notaGrauA;
	}

	public void setNotaGrauB(double nota){
		this.notaGrauB = nota;
	}

	public double getNotaGrauB(){
		return this.notaGrauB;
	}








}
