package trabalhofinal;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.time.format.DateTimeParseException;

public class Home {
	public static void main(String[] args) throws ParseException {
		menu();
	}
	public static void menu() throws ParseException {
		SimpleDateFormat formatoData = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy, HH:mm");
		Date relogio = new Date(0);
		String dataFor = formatoData.format(relogio);//funçao so mostra data e hora achei maneiro pra colocar
		
		String opcao = "";
		while(!opcao.equals("6")) {
			System.out.println(dataFor);
			System.out.println("""
					***************************
					|        TBFN2.0          |
					|                         |
					|1 - Cadastra cliente.    |
					|2 - Cadastra produto.    |
					|3 - Fazer pedido.        |
					|4 - Lista de pedidos.    |
					|5 - Lista de clientes.   |
					|6 - Lista de produtos.   |
					|0 - Sair                 |
					|                         |
					***************************
					""");
			escolherOpcao(opcao);
		}
	}
	public static void cadastraCliente(List<Cliente> cliente,ConexaoBanco con ) throws ParseException {
		String res ="";
			
        
		do {
			try {
				
				String nome = Ler.lerString("Informe o nome:");
				String cpf = Ler.lerString("Informe o CPF: ");
				
				LocalDate data= null;
		        boolean dataValida = false;
		        while(!dataValida) {
					SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
					String dt = Ler.lerString("Informe a data de nascimento: 'yyyy-MM-dd' ");
					DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
					data=LocalDate.parse(dt,formatter);
					dataValida = true;
		        }
				String endereco = Ler.lerString("Informe o endereco: ");
				String telefone = Ler.lerString("Informe o telefone");
				//problema ai add data no banco de dado
				
				Cliente novoCliente = new Cliente(nome,cpf,data,endereco,telefone);
				cliente.add(novoCliente);
				con.cadastroCliente(novoCliente);
			} catch (DateTimeParseException e) {
				System.out.println("Formato de data inválido. Por favor, use o formato yyyy-MM-dd.");
	            
				// TODO: handle exception
			}//ate aqui é 			
			while(true) {
				res = Ler.lerString("Deseja continuar cadastrando? 1 - sim / 2 - retonar");
				if (res.equals("2")) {
					return;
				}else if (res.equals("1")){
					break;
				}else {
					System.out.println("OPÇÃO INVÁLIDA. TENTE NOVAMENTE.");
				}
			}
		}while(res.equals("1"));
	}

	public static void cadastraProduto(List<Produto> produto,ConexaoBanco con ){
		String res;
		
		do {
			String nome = Ler.lerString("Informe a descri:");
			double vl_custo = Ler.lerDouble("Informe valor de custo: ");
			double vl_venda = Ler.lerDouble("Informe valor de venda: ");			
			String categoria = Ler.lerString("Informe a categoria: ");
		
			Produto novoProduto = new Produto(nome,vl_custo,vl_venda,categoria);
			produto.add(novoProduto);
			con.cadastraProduto(novoProduto);		
			while(true) {
				res = Ler.lerString("Deseja continuar cadastrando? 1 - sim / 2 - retonar");
				if (res.equals("2")) {
					return;
				}else if (res.equals("1")){
					break;
				}else {
					System.out.println("OPÇÃO INVÁLIDA. TENTE NOVAMENTE.");
				}
			}
		}while(res.equals("1"));
	}
	public static void escolherOpcao(String opcao) throws ParseException {
		List<Cliente> cliente = new ArrayList<Cliente>();// criação do array das classes
		List<Produto> produto = new ArrayList<Produto>();
		List<Pedido> pedido = new ArrayList<Pedido>();
		List<PedidoItens> pi = new ArrayList<PedidoItens>();
		
		ConexaoBanco con = new ConexaoBanco(); // criaçao para add no banco de dado
		opcao = Ler.lerString("Escolha a opção: ");
		switch (opcao) {
		 case "1":
			 cadastraCliente(cliente, con); //Chama a função para cadastra cliente
			 break;
		 case "2":
			 cadastraProduto(produto,con); //Chama a funçao para cadastra produto
			 break;
		 case "3" :
//           fazerPedido(Pedido pedido,PedidoItens pi,con);
			 break;
		 case "4":
			 listadePedido(con);
			 break;
		 case "5":
			 listaCliente(con);
			 break;
		 case "6":
			 listaProduto(con);
		 case "0":
		 System.out.println("ENCERRANDO O PROGRAMA...");
			 return;
		 default:
		     System.out.println("OPÇÃO INVÁLIDA. TENTE NOVAMENTE.");
	 }		
	}
	private static void listadePedido(ConexaoBanco con) {
		con.consultaTabela("pedido");
		
	}
	private static void listaProduto(ConexaoBanco con) {
		con.consultaTabela("produto");
		
	}
	public static void listaCliente(ConexaoBanco con) {
		con.consultaTabela("cliente");
	}
}
