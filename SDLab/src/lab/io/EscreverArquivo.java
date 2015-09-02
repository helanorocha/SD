package lab.io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class EscreverArquivo {
	
	OutputStream outputStream; 
	
	OutputStreamWriter outputStreamWriter;
	
	BufferedWriter bufferedWriter;
	
	public EscreverArquivo(String nomeAquivo) throws IOException {
		
		//Abri arquivo para escrever cadeia de bytes
		 outputStream = new FileOutputStream(nomeAquivo,true);

		//Converte de Char para Byte
		outputStreamWriter = new OutputStreamWriter(outputStream);

		//Receber String e converte em cadeia de Char
		bufferedWriter = new BufferedWriter(outputStreamWriter);
			
	}
	
	
	public void escreverLinha(String linha) throws IOException{
		
		//Escreve uma linha no arquivo e move o cursor do arquivo uma linha para baixo
		bufferedWriter.write(linha);
		bufferedWriter.newLine();
	}

	public void close() throws IOException{
		
		//Força enviar cadeia de Char para arquivo físico e fecha arquivo
		bufferedWriter.flush();
		bufferedWriter.close();
	}
}
