package trabalhofinal;


import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class PessoaAbstrata {
	protected String nome;
	protected String cpf;
	protected LocalDate dt_nascimento;
	
	public PessoaAbstrata(String nome, String cpf,LocalDate data) {
		this.nome = nome;
		this.cpf = cpf;
		this.dt_nascimento = data;
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
	public LocalDate getDt_nascimento() {
		return dt_nascimento;
	}
	public void setDt_nascimento(LocalDate dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}
	
}
