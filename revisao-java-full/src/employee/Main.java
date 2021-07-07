package employee;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();

		System.out.println("Entre com o nome: ");
		employee.name = sc.nextLine();
		System.out.println("Entre com o salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.println("Entre com a Tax: ");
		employee.tax = sc.nextDouble();
		employee.netSalary();
		System.out.println(employee);
		System.out.println("Which percentage to increase salary ? ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		System.out.println(employee);

		sc.close();

	}

}
