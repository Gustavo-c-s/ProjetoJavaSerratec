package trabalhofinal;

import java.sql.Date;

public abstract class PessoaAbstrata {
	private String nome;
	private String cpf;
	private Date dt_nascimento;
	
	public PessoaAbstrata(String nome, String cpf,Date dt_nascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.dt_nascimento = dt_nascimento;
	}
	public PessoaAbstrata() {	
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getDt_nascimento() {
		return dt_nascimento;
	}
	public void setDt_nascimento(Date dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}
	
}
