package entidades;

public class Gerente extends Pessoa{
	private double salario;
	
	public Gerente(String nome, String cpf, double salario) {
		super(nome, cpf);
		this.salario=salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	
	
	
	
	
	

}
