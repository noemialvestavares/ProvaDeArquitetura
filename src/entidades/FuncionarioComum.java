package entidades;

public class FuncionarioComum extends Pessoa{
	private String funcao;
	private double salario;
	
	public FuncionarioComum(String nome, String cpf, String funcao, double salario) {
		super(nome, cpf);
		this.funcao=funcao;
		this.salario=salario;
	}
	
	
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
	

}
