# Projeto Final de Programação Orientada a Objetos (POO)

Descrição do Projeto
Este projeto tem como objetivo criar um sistema de gerenciamento de pedidos, onde é possível realizar cadastros de pedidos para clientes e incluir produtos nestes pedidos. 
A persistência dos dados é feita utilizando o banco de dados PostgreSQL.

## Funcionalidades
1. Cadastro de Pedidos:
  - Inclusão, alteração e exclusão de pedidos.
  - Permite associar clientes e produtos aos pedidos.
  - Impressão dos dados do pedido com ou sem produtos.
  - Pesquisa de pedidos por código, cliente ou data.
2. Cadastro de Clientes:
  - Pesquisa de clientes por código, nome ou CPF.
  - Possibilidade de alterar o cliente associado ao pedido.
  - Não permite salvar pedidos sem cliente.
3. Cadastro de Produtos:
  - Inclusão e alteração de produtos nos pedidos.
  - Pesquisa de produtos por código.
  - Não permite gravar pedidos sem pelo menos um produto.

## Requisitos
  - Classe Pessoa (Abstrata): Define atributos e métodos comuns entre diferentes tipos de pessoas.
  - Classe Cliente: Herda de Pessoa e inclui informações específicas do cliente.
  - Classe Pedido: Representa um pedido, contendo dados como cliente, produtos e valores.
  - Classe Produto: Define os produtos disponíveis.
  - Classe PedidoItens: Representa os itens individuais de um pedido.
  - Interface CRUD: Implementada para fornecer as operações básicas de criação, leitura, atualização e exclusão (CRUD).
  - Classes DAO: Implementação das operações de persistência no banco de dados.
  - Conexão com PostgreSQL: Configurada através de um arquivo .ini para armazenamento e recuperação dos dados.
## Estrutura do Banco de Dados
- Cliente:
  - idcliente
  - nome
  - cpf
  - dtnascimento
  - endereco
  - telefone
- Produto:
  - idproduto
  - descricao
  - vlcusto
  - vlvenda
  - categoria
- Pedido:
  - idpedido
  - dtemissao
  - dtentrega
  - valortotal
  - observacao
- PedidoItens:
  - idpedidoitem
  - vlunitario
  - qtproduto
  - vldesconto

## Grupo
Eduarda Goulart
Fernanda Canto
Gabriel Siqueira
Gustavo Santos
Pedro Benvindo
Rafael Januzi
### Como Rodar o Projeto
Clone o repositório.
Configure a conexão com o PostgreSQL no arquivo .ini.
Importe o projeto no seu IDE de preferência.
Execute a aplicação.
