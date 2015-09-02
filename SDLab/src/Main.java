import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import NegocioLoc.Cliente;
import NegocioLoc.Filmes;
import NegocioLoc.Funcionario;
import lab.io.EscreverArquivo;
import lab.io.LerTeclado;



public class Main {
	private static InputStream is = new BufferedInputStream(System.in);
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		int opcao = 0;
		Scanner s = new Scanner(is);
		
		
		while(opcao != 4){
			System.out.println("Escolha qual cadastro gerenciar:");
			System.out.println("1 - Cliente");
			System.out.println("2 - Funcionario");
			System.out.println("3 - Filmes");
			System.out.println("4 - Sair");
			opcao = s.nextInt();
			
			switch(opcao){
				case 1:
					//Cadastro de clientes
					EscreverArquivo escreverArquivo = new EscreverArquivo("RegistroClientes");
					LerTeclado lerTeclado = new LerTeclado();
					Cliente cliente = new Cliente();

					System.out.println("Informe o nome do cliente:");
					String nome = lerTeclado.lerLinha();
					cliente.setNome(nome);

					System.out.println("Informe o id do cliente:");
					String id = lerTeclado.lerLinha();
					cliente.setId(Integer.parseInt(id));

					escreverArquivo.escreverLinha(cliente.toString());

					escreverArquivo.close();
					break;
				case 2:
					//Cadastro de funcionários
					EscreverArquivo escreverArquivo1 = new EscreverArquivo("RegistroFuncionarios");
					LerTeclado lerTeclado1 = new LerTeclado();
					Funcionario funcionario = new Funcionario();

					System.out.println("Informe o nome do Funcionário:");
					String nome1 = lerTeclado1.lerLinha();
					funcionario.setNome(nome1);

					System.out.println("Informe a lotação do Funcionário:");
					String lotacao = lerTeclado1.lerLinha();
					funcionario.setLotacao(lotacao);

					escreverArquivo1.escreverLinha(funcionario.toString());

					escreverArquivo1.close();
					break;
					
				case 3:
					//Cadastro de Filmes
					EscreverArquivo escreverArquivo2 = new EscreverArquivo("RegistroFilmes");
					LerTeclado lerTeclado2 = new LerTeclado();
					Filmes filme = new Filmes();

					System.out.println("Informe o nome do Filme: ");
					String NomeFilme = lerTeclado2.lerLinha();
					filme.setNomeFilme(NomeFilme);

					System.out.println("Informe o tipo de Filme: ");
					String TipoFilme = lerTeclado2.lerLinha();
					filme.setTipoFilme(TipoFilme);

					System.out.println("Informe a quantidade de Filmes: ");
					String QuantidadeFilme = lerTeclado2.lerLinha();
					filme.setQuantidadeFilme(Integer.parseInt(QuantidadeFilme));

					escreverArquivo2.escreverLinha(filme.toString());

					escreverArquivo2.close();
					break;
			}
		}
		s.close();
	}
		
		
		
		
		
		

		
		

	
		
		

	}

