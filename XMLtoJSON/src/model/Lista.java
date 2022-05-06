package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Lista {

public void MontaLista(ArrayList<String> ListaXML){
		
		try 
		{
	    	
	    	 FileReader arq = new FileReader("prog.xml");
		     BufferedReader lerArq = new BufferedReader(arq);      
		     String linha = lerArq.readLine();
	     
		     while (linha != null) 
		     {

		    	 ListaXML.add(linha);
		    	 linha = lerArq.readLine();
	    	 
		     }
		     arq.close();

	    } 
		catch (IOException e) 
		{
	        System.err.printf("Erro na abertura do arquivo: %s.\n",
	        e.getMessage());
	    }
		    
	}
}
