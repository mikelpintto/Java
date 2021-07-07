package student;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student student = new Student();

		System.out.println("Entre com o nome do estudante: ");
		student.nome = sc.nextLine();
		System.out.println("Entre com sua primeira nota: ");
		student.nota1 = sc.nextDouble();
		System.out.println("Entre com sua segunda nota: ");
		student.nota2 = sc.nextDouble();
		System.out.println("Entre com sua terceira nota: ");
		student.nota3 = sc.nextDouble();
		System.out.println("FINAL GRADE: " + student.notaFinalAluno());
		student.statusAluno();

		sc.close();

	}

}
