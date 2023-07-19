package teste.models;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Funcionario extends Pessoa {

	private BigDecimal salario;
	private String funcao;

	public Funcionario() {
	}
	
	public Funcionario(String nome, LocalDate dataNascimento, BigDecimal salario, String funcao) {
		super(nome, dataNascimento);
		this.salario = salario;
		this.funcao = funcao;
	}

	public BigDecimal getSalario() {
		return salario;
	}
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	public void aumentoSalario() {
		this.salario = salario.add(salario.multiply(new BigDecimal((double)10/100)));
	}
	

	@Override
	public String toString() {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String formattedDate = getDataNascimento().format(formatter);
		DecimalFormat df = new DecimalFormat("#,###.00");

		return "Nome: " + getNome() + ", Data Nascimento: " + formattedDate + ", Salário: " + df.format(salario) + ", Função: " + funcao;
	}
	
	

}
