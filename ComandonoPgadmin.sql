-- drop table pedido_itens;
-- drop table pedido;
-- drop table produto;
-- drop table clete;



create table cliente(
	id_cliente serial primary key,
	nome varchar(100) not null,
	cpf varchar(14) not null unique,
	dt_nascimento date not null,
	endereco varchar(100) not null,
	telefone varchar(15)not null
);

create table produto(
	id_produto serial primary key,
	descricao varchar(100) not null,
	vl_custo decimal not null,
	vl_venda decimal not null,
	categoria varchar not null
);

create table pedido(
	id_pedido serial primary key,
	dt_emissao date not null,
	dt_entrega date not null,
	observacao varchar(100),
	id_cliente int references cliente(id_cliente)not null
);
create table pedido_itens(
	id_pedidoitens serial primary key,
	vl_unitario decimal not null,
	qt_produto int not null,
	vl_desconto decimal not null,
	id_produto int references produto(id_produto)not null unique,
	id_pedido int references pedido(id_pedido)not null
);

insert into cliente (nome,cpf,dt_nascimento,endereco,telefone)
 values ('Gustavo Santos','123.456.789-10','1999-08-09','Rua de cima','21977952300'),
		('Fernada Canto','123.456.789-11','1999-02-20','Rua de baixo','21970707070'),
		('Eduarda Goulart','123.456.789-13','1997-02-19','Rua do lado','21955555555'),
		('Gabriel Siqueira','123.456.789-14','1998-04-09','Rua do outro lado','21910110260'),
		('Pedro Benvindo','123.456.789-15','1995-04-01','Rua de tras','21969696969'),
		('Rafael Januzi','123.456.789-16','1995-04-20','Rua da frente','21969696969');

select * from cliente;

insert into produto (descricao,vl_custo,vl_venda,categoria) 
values 
('Brahma',1.99,3.99,'bebida'),
('Coca-Cola',4.99,9.99,'bebida'),
('Agua',0.59,1.99,'bebida'),
('Sabão em pó',5.99,15.99,'limpiza'),
('Vassoura',5.99,9.99,'limpeza'),
('pirulito',0.50,1.99,'doce'),
('Diamante negro',3.99,12.99,'doce'),
('Camisa nike',15.99,90.99,'roupa'),
('Tenis Adida',30.99,200.99,'roupa')

select * from produto;