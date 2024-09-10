package trabalhofinal;

public class PedidoItens extends Produto{
	protected int qt_produto;
	protected double vl_desconto;
	

	public PedidoItens() {
		super();	
	}	
	public PedidoItens(String descricao, double vl_custo, double vl_venda, String categoria,int qt_produto, double vl_desconto) {
		super(descricao, vl_custo, vl_venda, categoria);
		this.qt_produto = qt_produto;
		this.vl_desconto = vl_desconto;
	}
	public int getQt_produto() {
		return qt_produto;
	}
	public void setQt_produto(int qt_produto) {
		this.qt_produto = qt_produto;
	}
	public double getVl_desconto() {
		return vl_desconto;
	}
	public void setVl_desconto(double vl_desconto) {
		this.vl_desconto = vl_desconto;
	}

}
