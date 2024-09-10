package trabalhofinal;

import java.sql.Date;

public class Cliente extends PessoaAbstrata {
	private String endereco;
	private String telefone;
	private int totalPedidoa;
	
	
	public Cliente() {
		super();
	}
	public Cliente(String nome, String cpf, Date dt_nascimento) {
		super(nome, cpf, dt_nascimento);
	}	
	public Cliente(String nome, String cpf, Date dt_nascimento, String endereco, String telefone) {
		super(nome, cpf, dt_nascimento);
		this.endereco = endereco;
		this.telefone = telefone;
		
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getTotalPedidoa() {
		return totalPedidoa;
	}
	public void setTotalPedidoa(int totalPedidoa) {
		this.totalPedidoa = totalPedidoa;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	@Override
	public String toString() {
		return "Cliente endereco : " + endereco + ", telefone: " + telefone + ", totalPedidoa: " + totalPedidoa
				+ ", getNome(): " + getNome() + ", getCpf(): " + getCpf() + ", getDt_nascimento():" + getDt_nascimento()
				+ ", getClass():" + getClass() + ", hashCode(): " + hashCode() + ", toString(): " + super.toString()
				;
	}




}
