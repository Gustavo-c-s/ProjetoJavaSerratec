package trabalhofinal;

import java.sql.Date;

public class Pedido extends Produto {
	private Date dt_emissao;
	private Date dt_entrega;
	private double valor_total;
	private String observacao;
		
	public Pedido() {
		super();	
	}

	public Pedido(String descricao, double vl_custo, double vl_venda, String categoria,Date dt_emissao, Date dt_entrega, String observacao) {
		super(descricao, vl_custo, vl_venda, categoria);
		this.dt_emissao = dt_emissao;
		this.dt_entrega = dt_entrega;
		this.observacao = observacao;
	}
	public Date getDt_emissao() {
		return dt_emissao;
	}
	public void setDt_emissao(Date dt_emissao) {
		this.dt_emissao = dt_emissao;
	}
	public Date getDt_entrega() {
		return dt_entrega;
	}
	public void setDt_entrega(Date dt_entrega) {
		this.dt_entrega = dt_entrega;
	}
	public double getValor_total() {
		return valor_total;
	}
	public void setValor_total(PedidoItens pi) {
		this.valor_total = (pi.qt_produto * getVl_venda())-pi.vl_desconto;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
}
