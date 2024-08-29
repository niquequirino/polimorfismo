package principal;

import java.util.Scanner;

import entidade.CLT;
import entidade.Funcionario;
import entidade.PJ;
import entidade.enums.Cargo;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome: ");
		String nome1 = sc.next();
		
		System.out.println("Digite o salario: ");
		double salario1 = sc.nextDouble();
		
		System.out.println("Digite o valor do adicional: " );
		double adicional1 =sc.nextDouble();
		
		Funcionario x = new PJ(nome1, salario1, Cargo.PROFESSOR, adicional1);
		System.out.println("nome: " + x.getNome() + " salario:" + x.getSalario() + " cargo: " + x.getCargo() + " receber: " + x.receber());
		
		
		System.out.println("Digite o nome: ");
		String nome2 = sc.next();
		
		System.out.println("Digite o salario: ");
		double salario2 = sc.nextDouble();
		
		System.out.println("Digite o valor do convenio: ");
		double convenio2 = sc.nextDouble();
		
		
		Funcionario w = new CLT(nome2, salario2, Cargo.DESENVOLVEDOR, convenio2);
		System.out.println("nome: " + w.getNome() + " salario: " + w.getSalario() + " cargo: " + w.getCargo() + " receber: " + w.receber());
		
		
	}

}
