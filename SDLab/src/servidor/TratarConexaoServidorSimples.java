package servidor;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

import lab.io.EscreverArquivo;

public class TratarConexaoServidorSimples implements Runnable {

	Socket cliente;
	
	public TratarConexaoServidorSimples(Socket cliente) {
		// TODO Auto-generated constructor stub
		this.cliente = cliente;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//Lê as informações enviadas pelo cliente
		Scanner entrada;
		try {
			entrada = new Scanner(cliente.getInputStream());
			String mensagem = entrada.nextLine();
			String params [] = mensagem.split("#");
			EscreverArquivo escreverArquivo = new EscreverArquivo(params[0]);
			int index = mensagem.indexOf("#")+1;
			escreverArquivo.escreverLinha(mensagem.substring(index));
//			System.out.println(mensagem.substring(index));
			escreverArquivo.close();
			PrintStream saida = new PrintStream(cliente.getOutputStream());
			saida.print("Escreveu no arquivo "+params[0]+"\n");
			saida.close();
			entrada.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
