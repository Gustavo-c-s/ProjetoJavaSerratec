package trabalhofinal;

public class Produto {
	private String descricao;
	private double vl_custo;
	private double vl_venda;
	private String categoria;
	
	
	
	public Produto() {

	}
	public Produto(String descricao, double vl_custo, double vl_venda, String categoria) {
		
		this.descricao = descricao;
		this.vl_custo = vl_custo;
		this.vl_venda = vl_venda;
		this.categoria = categoria;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getVl_custo() {
		return vl_custo;
	}
	public void setVl_custo(double vl_custo) {
		this.vl_custo = vl_custo;
	}
	public double getVl_venda() {
		return vl_venda;
	}
	public void setVl_venda(double vl_venda) {
		this.vl_venda = vl_venda;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
}
