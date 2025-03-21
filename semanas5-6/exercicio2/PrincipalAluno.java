public class PrincipalAluno{
	public static void main(String[] args){
		
		Aluno aluno1 = new Aluno("Brandamente Brasil", "1585258", 5.0d, 9.0d);
		Aluno aluno2 = new Aluno("Radigunda Cercená", "2254879", 8.0d, 2.0d);
		Aluno aluno3 = new Aluno("Vitimado José Araújo", "0085994", 7.0d, 1.0d);

		aluno1.imprimeInfo();
		aluno2.imprimeInfo();
		aluno3.imprimeInfo();

		aluno2.setNotaGrauA(9.0d);

		System.out.println(aluno2.calculaMediaFinal());
		System.out.println(aluno3.getMatricula());
		aluno1.setMatricula("1585228");
	}
}
