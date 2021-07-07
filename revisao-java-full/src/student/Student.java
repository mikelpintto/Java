package student;

public class Student {

	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;

	double diferencaPontos;

	public double notaFinalAluno() {

		return nota1 + nota2 + nota3;
	}

	public void statusAluno() {

		if (notaFinalAluno() > 60.0) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			diferencaPontos = 60.0 - notaFinalAluno();
			System.out.println("MISSING " + diferencaPontos + " POINTS");
		}

		
	}

}
