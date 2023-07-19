package teste.models;

import java.time.LocalDate;

public class Pessoa implements Comparable<Pessoa> {

	private String nome;
	private LocalDate dataNascimento;
	
	public Pessoa() {
	}
	
	public Pessoa(String nome, LocalDate dataNascimento) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public int compareTo(Pessoa p) {
		return this.getNome().compareTo(p.getNome());
	}
	
	
	
}
