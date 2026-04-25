package br.com.sistemaTest;

import java.util.Scanner;

import br.com.loja.CartaoDeCredito;
import br.com.loja.Cliente;
import br.com.loja.Entrega;
import br.com.loja.Produtos;

public final class HomePage1 {

	public static void main(String[] args) {

		System.out.println("======================================");
		System.out.println("==== BEM VINDO A LOJA A HILZMN ====");
		System.out.println("======================================");
		System.out.println();
		System.out.println("=== PRODUTOS ===");
		System.out.println();

		Produtos pro = new Produtos();
		pro.setNome("PERFUME 01");
		pro.setPreco(89.00);
		pro.setCodigo(123);
		pro.setDescricao("algodão doce, vanila e ameixa");

		Produtos pro1 = new Produtos();
		pro1.setNome("PERFUME 02");
		pro1.setPreco(85.00);
		pro1.setCodigo(1234);
		pro1.setDescricao("cravo, musdo de carvalho e bergamota");

		Produtos pro2 = new Produtos();
		pro2.setNome("PERFUME 03");
		pro2.setPreco(89.00);
		pro2.setCodigo(12345);
		pro1.setDescricao("lichia, pimenta e jasmin");

		System.out.println(pro.getNome());
		System.out.println("R$" + pro.getPreco());
		System.out.println("Codigo do Produto: " + pro.getCodigo());
		System.out.println("Comprar");
		System.out.println("Adicionar ao Carinho");
		System.out.println();

		System.out.println(pro1.getNome());
		System.out.println("R$" + pro1.getPreco());
		System.out.println("Codigo do Produto: " + pro1.getCodigo());
		System.out.println("Comprar");
		System.out.println("Adicionar ao Carinho");
		System.out.println();

		System.out.println(pro2.getNome());
		System.out.println("R$" + pro2.getPreco());
		System.out.println("Codigo do Produto: " + pro2.getCodigo());
		System.out.println("Comprar");
		System.out.println("Adicionar ao Carinho");
		System.out.println();

		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o Codigo do Produto Desejado");
		Produtos codigoDoProduto = new Produtos();
		int produtoSelecionado = leitor.nextInt();
		codigoDoProduto.setCodigo(produtoSelecionado);

		switch (produtoSelecionado) {
		case 12345:

			System.out.println();
			System.out.println("=== DESCRIÇÃO ===");
			System.out.println();
			System.out.println(pro2.getNome());
			System.out.println();
			System.out.println(pro2.getDescricao());
			System.out.println();
			System.out.println("Avista R$" + pro2.getPreco());
			System.out.println("OU ATÉ 3X de R$" + pro2.getPreco() / 3);
			System.out.println();

			break;

		case 1234:

			System.out.println();
			System.out.println("=== DESCRIÇÃO ===");
			System.out.println();
			System.out.println(pro1.getNome());
			System.out.println();
			System.out.println(pro1.getDescricao());
			System.out.println();
			System.out.println("Avista R$" + pro1.getPreco());
			System.out.println("OU EM ATÉ 3X de R$" + pro1.getPreco() / 3);
			System.out.println();

			break;

		case 123:

			System.out.println();
			System.out.println("=== DESCRIÇÃO ===");
			System.out.println();
			System.out.println(pro.getNome());
			System.out.println();
			System.out.println(pro.getDescricao());
			System.out.println();
			System.out.println("Avista R$" + pro.getPreco());
			System.out.println("OU ATÉ 3X de R$" + pro.getPreco() / 3);
			System.out.println();

			break;
		default:
			System.out.println("Opção Invalida");
			System.exit(0);

		}

		System.out.println("Comprar!! (sim / não)?");
		String simNao = leitor.next();
		switch (simNao) {
		case "não":
			System.exit(0);

			break;
		default:
			System.exit(0);
		case "sim": {

		}
			break;
		}
		System.out.println();
		System.out.println("=== CALCULAR FRETE ===");
		System.out.println();
		System.out.println("Digite Seu CEP Sem Traço");

		double cep = leitor.nextDouble();
		Entrega entreg = new Entrega();
		entreg.setCep(cep);

		double valor = entreg.getFrete();

		System.out.println();
		System.out.println("Valor do Frete R$" + entreg.getFrete());
		System.out.println();
		System.out.println("Prazo de entrega: 5 dias uteis");
		System.out.println();
		System.out.println("=== MEU CARRINHO ===");
		System.out.println();

		switch (produtoSelecionado) {
		case 123:
			System.out.println(pro2.getNome());
			break;
		case 1234:
			System.out.println(pro1.getNome());
			break;
		case 12345:
			System.out.println(pro.getNome());
			break;
		}

		switch (produtoSelecionado) {
		case 123:
			System.out.println("Preco Por Unidade R$" + pro2.getPreco());
			break;
		case 1234:
			System.out.println("Preco Por Unidade R$" + pro1.getPreco());
			break;
		case 12345:
			System.out.println("Preco Por Unidade R$" + pro.getPreco());
			break;
		}

		System.out.println("DIGITE A QUANTIDADE QUE DESEJA!!: ");
		int quantidade = leitor.nextInt();
		System.out.println();

		double valo2 = quantidade * pro2.getPreco() + valor;
		double valo1 = quantidade * pro1.getPreco() + valor;
		double valo = quantidade * pro.getPreco() + valor;
		switch (produtoSelecionado) {
		case 123:
			System.out.println("Preço Total Com Frete R$: " + valo2);
			break;
		case 1234:
			System.out.println("Preço Total Com Frete R$: " + valo1);
			break;
		case 12345:
			System.out.println("Preço Total Com Frete R$: " + valo);
			break;
		}
		System.out.println();
		System.out.println("Para Continuar Por Favor Digitar seu Email!");

		String email = leitor.next();
		Cliente novoCliente = new Cliente();
		novoCliente.setEmail(email);

		System.out.println();
		System.out.println("Email Não Cadastrado Por Favor Cadastre - se");
		System.out.println();
		System.out.println("Deseja Cadastrar Dados Pessoais (sim / não)?");

		String simNao1 = leitor.next();
		switch (simNao1) {
		case "não":
			System.exit(0);

			break;
		default:
			System.exit(0);
		case "sim": {

		}
			break;
		}

		System.out.println();
		System.out.println("=== DADOS PESSOAIS === ");
		System.out.println();
		System.out.println("Digite Seu Primeiro Nome:");

		String nome = leitor.next();
		novoCliente.setNome(nome);

		System.out.println();
		System.out.println("Digite Seu Segundo Nome:");

		String nomes = leitor.next();
		novoCliente.setSegundoNome(nomes);

		System.out.println();
		System.out.println("Digite Seu Telefone:");

		String telefone = leitor.next();
		novoCliente.setTelefone(telefone);

		System.out.println();
		System.out.println("Digite Seu CPF :");
		String CPF = leitor.next();
		novoCliente.setCpfS(CPF);

		System.out.println();
		System.out.println("Deseja Cadastrar Dados Para Entrega (sim / não)?");
		String simNao2 = leitor.next();
		switch (simNao2) {
		case "não":
			System.exit(0);

			break;
		default:
			System.exit(0);
		case "sim": {

		}
			break;
		}

		System.out.println();
		System.out.println("=== ENTREGA ===");
		System.out.println();
		System.out.println("Digite Seu Endecero: ");
		
		Scanner leitor2 = new Scanner(System.in);
		String y= leitor2.nextLine();
		
		
		System.out.println();
		System.out.println("=Destinatario(a)=");
		Entrega now = new Entrega();

		System.out.println();
		System.out.println("Primeiro Nome:");
		String primeiro = leitor.next();
		now.setPrimeiroNome(primeiro);

		System.out.println();
		System.out.println("Segundo Nome:");
		String primeiro1 = leitor.next();
		now.setPrimeiroNome(primeiro1);

		System.out.println("Deseja Selecionar Forma de Pagamento (sim / não)?");
		String simNao3 = leitor.next();
		switch (simNao3) {
		case "não":
			System.exit(0);

			break;
		default:
			System.exit(0);
		case "sim": {

		}
			break;
		}

		System.out.println();
		System.out.println("=== PAGAMENTO ===");
		System.out.println();
		System.out.println("Escolha a Forma de Pagamento:");
		System.out.println();
		System.out.println("(1) Cartão de credito");
		System.out.println("(2) PagSeguro");
		System.out.println("(3) Boleto Bancario");
		System.out.println();
		System.out.println("Digite a opção ");

		int formaDePagamento = leitor.nextInt();

		switch (formaDePagamento) {

		case 1:
			CartaoDeCredito cartao = new CartaoDeCredito();

			System.out.println("Digite o Numero do Seu Cartão de Credito");

			long numero = leitor.nextLong();
			cartao.setNumero(numero);
			System.out.println();

			System.out.println("Digite a Bandeira do Seu Cartão de Credito");

			String bandeira = leitor2.nextLine();
			cartao.setBandeira(bandeira);
			System.out.println();

			System.out.println("Digite o Nome Impresso no Cartão");
			String nomeCartao = leitor2.nextLine();
			cartao.setNomeImpresso(nomeCartao);

			System.out.println();
			System.out.println("Digite a validade (Mês / Ano");

			String mesAno = leitor.next();
			cartao.setMesAno(mesAno);

			System.out.println();
			System.out.println("Digite o Codigo de Segurança");

			int codigoSeguranca = leitor.nextInt();
			cartao.setCodigoDeSeguranca(codigoSeguranca);

			System.out.println();
			System.out.println("Digite o CPF do Titular do Cartão");

			String cpfCartao = leitor2.next();
			cartao.setCpfDonoDoCartao(cpfCartao);

			System.out.println();
			System.out.println("Digite a Quantidade de Parcelas Que Deseja");
			System.out.println();
			System.out.println("(1) 1x Sem Juros");
			System.out.println("(2) 2x Sem Juros");
			System.out.println("(3) 3x Sem Juros");
			System.out.println();

			double parcela = leitor.nextDouble();

			System.out.println();
			double valo5 = quantidade * pro2.getPreco() + valor;
			double valo4 = quantidade * pro1.getPreco() + valor;
			double valo3 = quantidade * pro.getPreco() + valor;

			switch (produtoSelecionado) {

			case 123:
				System.out.println("Preço Total Com Frete R$: " + valo5 / parcela);
				break;
			case 1234:
				System.out.println("Preço Total Com Frete R$: " + valo4 / parcela);
				break;
			case 12345:
				System.out.println("Preço das Parcelas Com Frete R$: " + valo3 / parcela);
				break;
			}

			System.out.println();

			System.out.println("Finalizar Conpra (sim / não)?");
			String simNao4 = leitor.next();
			switch (simNao4) {
			case "não":
				System.exit(0);

				break;
			default:
				System.exit(0);
			case "sim": {

			}
				break;
			}

			System.out.println();
			System.out.println("Obrigado por comprar na loja na Hilzmn!!");
			System.out.println();
			System.out.println("Mandamos os Dados do Seu Pedido Para o Seu Email");
			System.out.println();
			System.out.println("===============================");
			System.out.println("==== CANAIS DE ATENDIMENTO ====");
			System.out.println("===============================");
			System.out.println();
			System.out.println("Chat");
			System.out.println();
			System.out.println("SAC: 0800 000 0000");
			System.out.println();
			System.out.println("Email: lojaHilzmn@gmail.com");
			System.out.println();
			System.out.println("Endereço: Rua dos Perfumes s/n - Vila Perfumada, São Paulo (SP)");
			break;

		case 2:
			CartaoDeCredito cartao1 = new CartaoDeCredito();
			System.out.println("Digite o Numero do Seu Cartão de Credito");

			long numero2 = leitor.nextLong();
			cartao1.setNumero(numero2);
			System.out.println();

			System.out.println("Digite a Bandeira do Seu Cartão de Credito");
			

			Scanner leitor3 = new Scanner(System.in);
			String w= leitor3.nextLine();

			String bandeira2 = leitor3.nextLine();
			cartao1.setBandeira(bandeira2);

			System.out.println();
			System.out.println("Digite o Nome Impresso no Cartão");

			String nomeCartao1 = leitor3.nextLine();
			cartao1.setNomeImpresso(nomeCartao1);

			System.out.println();
			System.out.println("Digite a validade (Mês / Ano");

			String mesAno1 = leitor.next();
			cartao1.setMesAno(mesAno1);

			System.out.println();
			System.out.println("Digite o Codigo de Segurança");

			int codigoSeguranca1 = leitor.nextInt();
			cartao1.setCodigoDeSeguranca(codigoSeguranca1);

			System.out.println();
			System.out.println("Digite o CPF do Titular do Cartão");

			String cpfCartao1 = leitor.next();
			cartao1.setCpfDonoDoCartao(cpfCartao1);

			System.out.println();
			System.out.println("Digite a Quantidade de Parcelas Que Deseja");
			System.out.println();
			System.out.println("(1) 1x Sem Juros");
			System.out.println("(2) 2x Sem Juros");
			System.out.println("(3) 3x Sem Juros");
			System.out.println();

			double parcela1 = leitor.nextDouble();

			System.out.println();
			double valo8 = quantidade * pro2.getPreco() + valor;
			double valo7 = quantidade * pro1.getPreco() + valor;
			double valo6 = quantidade * pro.getPreco() + valor;

			switch (produtoSelecionado) {

			case 123:
				System.out.println("Preço Total Com Frete R$: " + valo8 / parcela1);
				break;
			case 1234:
				System.out.println("Preço Total Com Frete R$: " + valo7 / parcela1);
				break;
			case 12345:
				System.out.println("Preço das Parcelas Com Frete R$: " + valo6 / parcela1);
				break;
			}

			System.out.println("Finalizar Conpra (sim / não)?");
			String simNao5 = leitor.next();
			switch (simNao5) {
			case "não":
				System.exit(0);

				break;
			default:
				System.exit(0);
			case "sim": {

			}
				break;
			}

			System.out.println();
			System.out.println("Obrigado por comprar na loja na Hilzmn!!");
			System.out.println();
			System.out.println("Mandamos os Dados do Seu Pedido Para o Seu Email");
			System.out.println();
			System.out.println("===============================");
			System.out.println("==== CANAIS DE ATENDIMENTO ====");
			System.out.println("===============================");
			System.out.println();
			System.out.println("Chat");
			System.out.println();
			System.out.println("SAC: 0800 000 0000");
			System.out.println();
			System.out.println("Email: lojaHilzmn@gmail.com");
			System.out.println();
			System.out.println("Endereço: Rua dos Perfumes s/n - Vila Perfumada, São Paulo (SP)");
			break;

		case 3:

			System.out.println();
			System.out.println("Gerar Boleto (sim / não)?");
			String simNao6 = leitor.next();
			switch (simNao6) {
			case "não":
				System.exit(0);

				break;
			default:
				System.exit(0);
			case "sim": {

			}
				break;
			}

			System.out.println();
			System.out.println("SEU PEDIDO FOI RECEBIDO POR FAVOR PAGAR O BOLETO PARA FINALIZAR");
			System.out.println();
			System.out.println("Numero do boleto:");
			System.out.println("1221552031561613213216165130320315");
			System.out.println();
			System.out.println("AGUARDDO PAGAMENTO!!");
			System.out.println();
			System.out.println("Obrigado por comprar na loja de Hilzmn !!");
			System.out.println();
			System.out.println("Mandamos os Dados do Seu Pedido Para o Seu Email");
			System.out.println();
			System.out.println("===============================");
			System.out.println("==== CANAIS DE ATENDIMENTO ====");
			System.out.println("===============================");
			System.out.println();
			System.out.println("Chat");
			System.out.println();
			System.out.println("SAC: 0800 000 0000");
			System.out.println();
			System.out.println("Email: lojaDeHilzmn@gmail.com");
			System.out.println();
			System.out.println("Endereço: Rua dos Perfumes s/n - Vila Perfumada, São Paulo (SP)");
		}


	}

}
