package lab.io;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;




import lab.io.*;
public class LerTeclado {

	InputStream	inputStream;
	InputStreamReader inputStreamReader;
	BufferedReader bufferedReader;
	
	public LerTeclado() throws IOException{
			
			System.out.print("Digite um texto:");
			
			//Ler cadeia de bytes de um teclado
			InputStream inputStream = System.in;
			
			//Converte para Char
			InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
			
			//Concatena o conjunto de Char em uma String
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			

			
			
			//System.out.println("O texto digitado foi: " + line);
			
			
		}
		public String lerLinha() throws IOException{
			//Lê uma linha
			String line = bufferedReader.readLine();
			return line;
			
		}
		
		public void close() throws IOException{
		//Close
		bufferedReader.close();
		{
}
		}
}
