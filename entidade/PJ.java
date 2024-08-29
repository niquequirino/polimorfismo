package entidade;

import entidade.enums.Cargo;

public class PJ extends Funcionario{
	
	private double adicional; 
	
	public PJ(String nome, double salario, Cargo cargo, double adicional) {
		super(nome, salario, cargo);
		this.adicional = adicional;
	}
	

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	public double receber() {
		return salario * 0.90 + adicional;
		
	}
	
	


}
