package trabalhofinal;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class ConexaoBanco {
	String url = "jdbc:postgresql://localhost:5432/ProjetojavaSerratec";
		String usuario = "postgres";
		String senha = "135790";
	
	public Connection conectar()throws SQLException {
		return DriverManager.getConnection(url,usuario,senha);
	}
	public void cadastroCliente(Cliente cliente) {
		String isert ="insert into cliente (nome,cpf,dt_nascimento,endereco,telefone)"
				+ "values(?,?,?,?,?)";
				
		try (Connection con = conectar();
			PreparedStatement pstmt = con.prepareStatement(isert)){
			pstmt.setString(1,cliente.getNome());
			pstmt.setString(2,cliente.getCpf());
			pstmt.setDate(3, Date.valueOf(cliente.getDt_nascimento()));
			pstmt.setString(4,cliente.getEndereco());
			pstmt.setString(5,cliente.getTelefone());
			pstmt.executeUpdate();
			System.out.println("Cliente cadastrado com sucesso!!");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public void cadastraProduto(Produto produto) {
		String isert ="insert into produto (descricao,vl_custo,vl_venda,categoria)"
				+ "values(?,?,?,?)";
		
		try (Connection con = conectar();
			PreparedStatement pstmt = con.prepareStatement(isert)){
			pstmt.setString(1,produto.getDescricao());
			pstmt.setDouble(2,produto.getVl_custo());
			pstmt.setDouble(3,produto.getVl_venda());
			pstmt.setString(4,produto.getCategoria());
			pstmt.executeUpdate();
			System.out.println("Cliente cadastrado com sucesso!!");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public void consultaTabela(String tabela) {
		String select =" select * from "+tabela.toLowerCase();
		
		try (Connection con = conectar();
				PreparedStatement pstmt = con.prepareStatement(select);
					ResultSet resultado=pstmt.executeQuery()){
			
			ResultSetMetaData metaData = resultado.getMetaData();
			int coluna =metaData.getColumnCount();
			while(resultado.next()) {
				for(int i =1;i<=coluna;i++) {
					System.out.println(metaData.getColumnName(i)+": "+resultado.getString(i)+".");
				}System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
}
