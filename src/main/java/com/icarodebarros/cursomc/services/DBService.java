package com.icarodebarros.cursomc.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.icarodebarros.cursomc.domain.Categoria;
import com.icarodebarros.cursomc.domain.Cidade;
import com.icarodebarros.cursomc.domain.Cliente;
import com.icarodebarros.cursomc.domain.Endereco;
import com.icarodebarros.cursomc.domain.Estado;
import com.icarodebarros.cursomc.domain.ItemPedido;
import com.icarodebarros.cursomc.domain.Pagamento;
import com.icarodebarros.cursomc.domain.PagamentoComBoleto;
import com.icarodebarros.cursomc.domain.PagamentoComCartao;
import com.icarodebarros.cursomc.domain.Pedido;
import com.icarodebarros.cursomc.domain.Produto;
import com.icarodebarros.cursomc.domain.enums.EstadoPagamento;
import com.icarodebarros.cursomc.domain.enums.Perfil;
import com.icarodebarros.cursomc.domain.enums.TipoCliente;
import com.icarodebarros.cursomc.repositories.CategoriaRepository;
import com.icarodebarros.cursomc.repositories.CidadeRepository;
import com.icarodebarros.cursomc.repositories.ClienteRepository;
import com.icarodebarros.cursomc.repositories.EnderecoRepository;
import com.icarodebarros.cursomc.repositories.EstadoRepository;
import com.icarodebarros.cursomc.repositories.ItemPedidoRepository;
import com.icarodebarros.cursomc.repositories.PagamentoRepository;
import com.icarodebarros.cursomc.repositories.PedidoRepository;
import com.icarodebarros.cursomc.repositories.ProdutoRepository;

@Service
public class DBService {
	
	@Autowired
	private BCryptPasswordEncoder pe;
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@Autowired
	private PagamentoRepository pagamentoRepository;
	
	@Autowired
	private ItemPedidoRepository itemPedidoRepository;
	
	public void instantiateTestDatabase() throws ParseException {
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");
		Categoria cat3 = new Categoria(null, "Cama mesa e banho");
		Categoria cat4 = new Categoria(null, "Eletrônicos");
		Categoria cat5 = new Categoria(null, "Jardinagem");
		Categoria cat6 = new Categoria(null, "Decoração");
		Categoria cat7 = new Categoria(null, "Perfumaria");
		
		Produto p1 = new Produto(null, "Computador", 2000.00);
		Produto p2 = new Produto(null, "Impressora", 800.00);
		Produto p3 = new Produto(null, "Mouse", 80.00);
		Produto p4 = new Produto(null, "Mesa de escritório", 300.00);
		Produto p5 = new Produto(null, "Toalha", 50.00);
		Produto p6 = new Produto(null, "Colcha", 200.00);
		Produto p7 = new Produto(null, "TV true color", 1200.00);
		Produto p8 = new Produto(null, "Roçadeira", 800.00);
		Produto p9 = new Produto(null, "Abajour", 100.00);
		Produto p10 = new Produto(null, "Pendente", 180.00);
		Produto p11 = new Produto(null, "Shampoo", 90.00);
		Produto p12 = new Produto(null, "Produto 12", 10.00);
		Produto p13 = new Produto(null, "Produto 13", 10.00);
		Produto p14 = new Produto(null, "Produto 14", 10.00);
		Produto p15 = new Produto(null, "Produto 15", 10.00);
		Produto p16 = new Produto(null, "Produto 16", 10.00);
		Produto p17 = new Produto(null, "Produto 17", 10.00);
		Produto p18 = new Produto(null, "Produto 18", 10.00);
		Produto p19 = new Produto(null, "Produto 19", 10.00);
		Produto p20 = new Produto(null, "Produto 20", 10.00);
		Produto p21 = new Produto(null, "Produto 21", 10.00);
		Produto p22 = new Produto(null, "Produto 22", 10.00);
		Produto p23 = new Produto(null, "Produto 23", 10.00);
		Produto p24 = new Produto(null, "Produto 24", 10.00);
		Produto p25 = new Produto(null, "Produto 25", 10.00);
		Produto p26 = new Produto(null, "Produto 26", 10.00);
		Produto p27 = new Produto(null, "Produto 27", 10.00);
		Produto p28 = new Produto(null, "Produto 28", 10.00);
		Produto p29 = new Produto(null, "Produto 29", 10.00);
		Produto p30 = new Produto(null, "Produto 30", 10.00);
		Produto p31 = new Produto(null, "Produto 31", 10.00);
		Produto p32 = new Produto(null, "Produto 32", 10.00);
		Produto p33 = new Produto(null, "Produto 33", 10.00);
		Produto p34 = new Produto(null, "Produto 34", 10.00);
		Produto p35 = new Produto(null, "Produto 35", 10.00);
		Produto p36 = new Produto(null, "Produto 36", 10.00);
		Produto p37 = new Produto(null, "Produto 37", 10.00);
		Produto p38 = new Produto(null, "Produto 38", 10.00);
		Produto p39 = new Produto(null, "Produto 39", 10.00);
		Produto p40 = new Produto(null, "Produto 40", 10.00);
		Produto p41 = new Produto(null, "Produto 41", 10.00);
		Produto p42 = new Produto(null, "Produto 42", 10.00);
		Produto p43 = new Produto(null, "Produto 43", 10.00);
		Produto p44 = new Produto(null, "Produto 44", 10.00);
		Produto p45 = new Produto(null, "Produto 45", 10.00);
		Produto p46 = new Produto(null, "Produto 46", 10.00);
		Produto p47 = new Produto(null, "Produto 47", 10.00);
		Produto p48 = new Produto(null, "Produto 48", 10.00);
		Produto p49 = new Produto(null, "Produto 49", 10.00);
		Produto p50 = new Produto(null, "Produto 50", 10.00);
		
		cat1.getProdutos().addAll(Arrays.asList(p12, p13, p14, p15, p16, p17, p18, p19, p20,
				p21, p22, p23, p24, p25, p26, p27, p28, p29, p30, p31, p32, p34, p35, p36, p37, p38,
				p39, p40, p41, p42, p43, p44, p45, p46, p47, p48, p49, p50));
		cat2.setProdutos(Arrays.asList(p2, p4)); // cat2.getProdutos().addAll(Arrays.asList(p2, p4));
		cat3.setProdutos(Arrays.asList(p5, p6)); // ...
		cat4.setProdutos(Arrays.asList(p1, p2, p3, p7));
		cat5.setProdutos(Arrays.asList(p8));
		cat6.setProdutos(Arrays.asList(p9, p10));
		cat7.setProdutos(Arrays.asList(p11));
		
		p1.setCategorias(Arrays.asList(cat1, cat4));
		p2.setCategorias(Arrays.asList(cat1, cat2, cat4));
		p3.setCategorias(Arrays.asList(cat1, cat4));
		p4.setCategorias(Arrays.asList(cat2));
		p5.setCategorias(Arrays.asList(cat3));
		p6.setCategorias(Arrays.asList(cat3));
		p7.setCategorias(Arrays.asList(cat4));
		p8.setCategorias(Arrays.asList(cat5));
		p9.setCategorias(Arrays.asList(cat6));
		p10.setCategorias(Arrays.asList(cat6));
		p11.setCategorias(Arrays.asList(cat7));
		p12.getCategorias().add(cat1);
		p13.getCategorias().add(cat1);
		p14.getCategorias().add(cat1);
		p15.getCategorias().add(cat1);
		p16.getCategorias().add(cat1);
		p17.getCategorias().add(cat1);
		p18.getCategorias().add(cat1);
		p19.getCategorias().add(cat1);
		p20.getCategorias().add(cat1);
		p21.getCategorias().add(cat1);
		p22.getCategorias().add(cat1);
		p23.getCategorias().add(cat1);
		p24.getCategorias().add(cat1);
		p25.getCategorias().add(cat1);
		p26.getCategorias().add(cat1);
		p27.getCategorias().add(cat1);
		p28.getCategorias().add(cat1);
		p29.getCategorias().add(cat1);
		p30.getCategorias().add(cat1);
		p31.getCategorias().add(cat1);
		p32.getCategorias().add(cat1);
		p33.getCategorias().add(cat1);
		p34.getCategorias().add(cat1);
		p35.getCategorias().add(cat1);
		p36.getCategorias().add(cat1);
		p37.getCategorias().add(cat1);
		p38.getCategorias().add(cat1);
		p39.getCategorias().add(cat1);
		p40.getCategorias().add(cat1);
		p41.getCategorias().add(cat1);
		p42.getCategorias().add(cat1);
		p43.getCategorias().add(cat1);
		p44.getCategorias().add(cat1);
		p45.getCategorias().add(cat1);
		p46.getCategorias().add(cat1);
		p47.getCategorias().add(cat1);
		p48.getCategorias().add(cat1);
		p49.getCategorias().add(cat1);
		p50.getCategorias().add(cat1);
				
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3, cat4, cat5, cat6, cat7));
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11));
		produtoRepository.saveAll(Arrays.asList(p12, p13, p14, p15, p16, p17, p18, p19, p20,
				p21, p22, p23, p24, p25, p26, p27, p28, p29, p30, p31, p32, p34, p35, p36, p37, p38,
				p39, p40, p41, p42, p43, p44, p45, p46, p47, p48, p49, p50));
		
		Estado est1 = new Estado(null, "Minas Gerais");
		Estado est2 = new Estado(null, "São Paulo");
		
		Cidade c1 = new Cidade(null, "Uberlândia", est1);
		Cidade c2 = new Cidade(null, "São Paulo", est2);
		Cidade c3 = new Cidade(null, "Campinas", est2);
		
		est1.getCidades().addAll(Arrays.asList(c1));
		est2.getCidades().addAll(Arrays.asList(c2, c3));
		
		estadoRepository.saveAll(Arrays.asList(est1, est2));
		cidadeRepository.saveAll(Arrays.asList(c1, c2, c3));
		
		Cliente cli1 = new Cliente(null, "Maria Silva", "icarodebarros@bol.com.br", "36378912377", TipoCliente.PESSOAFISICA, pe.encode("123"));
		cli1.getTelefones().addAll(Arrays.asList("27363323", "93838393"));
		
		Cliente cli2 = new Cliente(null, "Ana Costa", "icaro_n_b@msn.com", "31628382740", TipoCliente.PESSOAFISICA, pe.encode("123"));
		cli2.addPerfil(Perfil.ADMIN);
		cli1.getTelefones().addAll(Arrays.asList("45834568", "84261597"));
		
		Endereco e1 = new Endereco(null, "Rua Flores", "300", "Apto 303", "Jardim", "38220834", cli1, c1);
		Endereco e2 = new Endereco(null, "Avenida Matos", "105", "Sala 800", "Centro", "38777012", cli1, c2);
		Endereco e3 = new Endereco(null, "Avenida Floriano", "2106", null, "Centro", "281777012", cli2, c2);
		
		cli1.getEnderecos().addAll(Arrays.asList(e1, e2));
		cli2.getEnderecos().addAll(Arrays.asList(e3));
		
		clienteRepository.saveAll(Arrays.asList(cli1, cli2));
		enderecoRepository.saveAll(Arrays.asList(e1, e2, e3));
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm");
		
		Pedido ped1 = new Pedido(null, sdf.parse("30/09/2017 10:32"), cli1, e1);
		Pedido ped2 = new Pedido(null, sdf.parse("10/10/2017 19:35"), cli1, e2);
		
		Pagamento pagto1 = new PagamentoComCartao(null, EstadoPagamento.QUITADO, ped1, 6);
		ped1.setPagamento(pagto1);
		
		Pagamento pagto2 = new PagamentoComBoleto(null, EstadoPagamento.PENDENTE, ped2, sdf.parse("20/10/2017 00:00"), null);
		ped2.setPagamento(pagto2);
		
		cli1.getPedidos().addAll(Arrays.asList(ped1, ped2));
		
		pedidoRepository.saveAll(Arrays.asList(ped1, ped2));
		pagamentoRepository.saveAll(Arrays.asList(pagto1, pagto2));
		
		ItemPedido ip1 = new ItemPedido(ped1, p1, 0.00, 1, 2000.00);
		ItemPedido ip2 = new ItemPedido(ped1, p3, 0.00, 2, 80.00);
		ItemPedido ip3 = new ItemPedido(ped2, p2, 100.00, 1, 800.00);
		
		ped1.getItens().addAll(Arrays.asList(ip1, ip2));
		ped2.getItens().addAll(Arrays.asList(ip3));
		
		p1.getItens().addAll(Arrays.asList(ip1));
		p2.getItens().addAll(Arrays.asList(ip3));
		p3.getItens().addAll(Arrays.asList(ip2));
		
		itemPedidoRepository.saveAll(Arrays.asList(ip1, ip2, ip3));
		
		/*
			**** BASE DE DADOS H2 GERADA: ****
			
			SELECT * FROM CATEGORIA;
			ID  	NOME  
			1	Informática
			2	Escritório
			3	Cama mesa e banho
			4	Eletrônicos
			5	Jardinagem
			6	Decoração
			7	Perfumaria
			
			SELECT * FROM CIDADE;
			ID  	NOME  	ESTADO_ID  
			1	Uberlândia	1
			2	São Paulo	2
			3	Campinas	2
			
			SELECT * FROM CLIENTE;
			ID  	CPF_OU_CNPJ  	EMAIL  	NOME  	SENHA  	TIPO  
			1	36378912377	icarodebarros@bol.com.br	Maria Silva	$2a$10$DIltSiodRMD4zP8CjFpN9eRcMgLxnn/sAIBXoQioXY9DWlUyg2cLS	1
			2	31628382740	icaro_n_b@msn.com	Ana Costa	$2a$10$/XhtZAGOGsv3KGscmveZouaYQVQR8lMhoM5crIyta6hqaJ5J9Ytei	1
			
			SELECT * FROM ENDERECO;
			ID  	BAIRRO  	CEP  	COMPLEMENTO  	LOGRADOURO  	NUMERO  	CIDADE_ID  	CLIENTE_ID  
			1	Jardim	38220834	Apto 303	Rua Flores	300	1	1
			2	Centro	38777012	Sala 800	Avenida Matos	105	2	1
			3	Centro	281777012	null	Avenida Floriano	2106	2	2
			
			SELECT * FROM ESTADO;
			ID  	NOME  
			1	Minas Gerais
			2	São Paulo
			
			SELECT * FROM ITEM_PEDIDO;
			DESCONTO  	PRECO  	QUANTIDADE  	PEDIDO_ID  	PRODUTO_ID  
			0.0	2000.0	1	1	1
			0.0	80.0	2	1	3
			100.0	800.0	1	2	2
			
			SELECT * FROM PAGAMENTO;
			PEDIDO_ID  	ESTADO  
			1	2
			2	1
			
			SELECT * FROM PAGAMENTO_COM_BOLETO;
			DATA_PAGAMENTO  	DATA_VENCIMENTO  	PEDIDO_ID  
			null	2017-10-20 00:00:00	2
			
			SELECT * FROM PAGAMENTO_COM_CARTAO;
			NUMERO_DE_PARCELAS  	PEDIDO_ID  
			6	1
			
			SELECT * FROM PEDIDO;
			ID  	INSTANTE  	CLIENTE_ID  	ENDERECO_DE_ENTREGA_ID  
			1	2017-09-30 10:32:00	1	1
			2	2017-10-10 19:35:00	1	2
			
			SELECT * FROM PERFIS;
			CLIENTE_ID  	PERFIS  
			1	2
			2	1
			2	2
			
			SELECT * FROM PRODUTO;
			ID  	NOME  	PRECO  
			1	Computador	2000.0
			2	Impressora	800.0
			3	Mouse	80.0
			4	Mesa de escritório	300.0
			5	Toalha	50.0
			6	Colcha	200.0
			7	TV true color	1200.0
			8	Roçadeira	800.0
			9	Abajour	100.0
			10	Pendente	180.0
			11	Shampoo	90.0
			12	Produto 12	10.0
			13	Produto 13	10.0
			14	Produto 14	10.0
			15	Produto 15	10.0
			16	Produto 16	10.0
			17	Produto 17	10.0
			18	Produto 18	10.0
			19	Produto 19	10.0
			20	Produto 20	10.0
			21	Produto 21	10.0
			22	Produto 22	10.0
			23	Produto 23	10.0
			24	Produto 24	10.0
			25	Produto 25	10.0
			26	Produto 26	10.0
			27	Produto 27	10.0
			28	Produto 28	10.0
			29	Produto 29	10.0
			30	Produto 30	10.0
			31	Produto 31	10.0
			32	Produto 32	10.0
			33	Produto 34	10.0
			34	Produto 35	10.0
			35	Produto 36	10.0
			36	Produto 37	10.0
			37	Produto 38	10.0
			38	Produto 39	10.0
			39	Produto 40	10.0
			40	Produto 41	10.0
			41	Produto 42	10.0
			42	Produto 43	10.0
			43	Produto 44	10.0
			44	Produto 45	10.0
			45	Produto 46	10.0
			46	Produto 47	10.0
			47	Produto 48	10.0
			48	Produto 49	10.0
			49	Produto 50	10.0
			
			SELECT * FROM PRODUTO_CATEGORIA;
			PRODUTO_ID  	CATEGORIA_ID  
			1	1
			1	4
			2	1
			2	2
			2	4
			3	1
			3	4
			4	2
			5	3
			6	3
			7	4
			8	5
			9	6
			10	6
			11	7
			12	1
			13	1
			14	1
			15	1
			16	1
			17	1
			18	1
			19	1
			20	1
			21	1
			22	1
			23	1
			24	1
			25	1
			26	1
			27	1
			28	1
			29	1
			30	1
			31	1
			32	1
			33	1
			34	1
			35	1
			36	1
			37	1
			38	1
			39	1
			40	1
			41	1
			42	1
			43	1
			44	1
			45	1
			46	1
			47	1
			48	1
			49	1
			
			SELECT * FROM TELEFONE;
			CLIENTE_ID  	TELEFONES  
			1	27363323
			1	45834568
			1	93838393
			1	84261597
		*/
	}

}
