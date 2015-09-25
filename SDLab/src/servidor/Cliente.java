package servidor;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente {

	public Cliente (String mensagem) throws UnknownHostException, IOException{
		
		//Conecta ao Servidor
		Socket cliente = new Socket("127.0.0.1", 12345);
		PrintStream saida = new PrintStream(cliente.getOutputStream());
		Scanner entrada = new Scanner(cliente.getInputStream());
		System.out.println("O cliente se conectou no servidor!");
		
		//Ler do teclado e envia para o servidor
		saida.print(mensagem+"\n");
		String resposta = entrada.nextLine();
		System.out.println(resposta);
		//Fecha conexão
		entrada.close();
		saida.close();
		cliente.close();
	}
	
	
}
