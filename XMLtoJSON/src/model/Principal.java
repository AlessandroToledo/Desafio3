package model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) throws IOException {
		
		ArrayList<String> ListaXml = new ArrayList<>();
		Lista lista = new Lista();
		lista.MontaLista(ListaXml);
		String validacao="";
		Validar valida=new Validar();
		EscreveArq escreve = new EscreveArq();
		int tamanho = ListaXml.size();
        
		
		for(int i = 0; i<tamanho;i++)
		{		
				validacao=validacao+ListaXml.get(i);		
		}
		
		if(valida.Validacao(validacao)==true) 
		{
			FileWriter arqW = new FileWriter("prog-check.json");
	        PrintWriter gravarArq = new PrintWriter(arqW);
	        	for(int i = 0; i<tamanho;i++)
	        	{
			
	        		if(i<tamanho-1) 
	        		{
	        			gravarArq.printf(escreve.Escrever(ListaXml.get(i),ListaXml.get(i+1)));
	        		}
	        		else 
	        		{
	        			gravarArq.printf(escreve.Escrever(ListaXml.get(i),null));
	        		}
	        	}
	        System.out.printf("\n Criação de Arquivo concluida \n Trabalho feito por: \n Alessandro 082190007 \n Guilherme 082190004 \n Gabriel Tadeu 082190012 \n Lucas Freitas 082190025 \n Murilo 082190034");
	        arqW.close();
		}
		
	}

}

