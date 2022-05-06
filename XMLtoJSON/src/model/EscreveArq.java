package model;


public class EscreveArq {
	
	String tabela;
	String subTabela;
	String coluna;
	String texto;
	
	public String Escrever(String palavra,String proxima){
				
		if(palavra.length()-1==palavra.indexOf('>')& tabela==null) 
		{
			tabela=palavra.substring(palavra.indexOf('<')+1,palavra.indexOf('>'));
			return "{%n\""+tabela+"\":{%n";
	   		
	   	}	
		else if(palavra.indexOf(tabela)!=-1 & palavra.indexOf('/')==-1) 
		{
			return "\""+tabela+"\":{%n";
		}
		else if(palavra.indexOf(tabela)==-1 & palavra.length()-1==palavra.indexOf('>') & tabela!=null&subTabela==null) 
		{
			subTabela=palavra.substring(palavra.indexOf('<')+1,palavra.indexOf('>'));
			return "\""+subTabela+"\":[%n{%n";
		}
		else if(proxima!=null ) 
		{
			if(palavra.length()-1!=palavra.indexOf('>')) 
			{
				if(proxima.indexOf('/')!=proxima.indexOf('<')+1) 
				{
					coluna=palavra.substring(palavra.indexOf('<')+1,palavra.indexOf('>'));
					texto=palavra.substring(palavra.indexOf('>')+1,palavra.indexOf('/')-1);
					return "\""+coluna+"\":\""+texto+"\",%n";
				}
				else 
				{
					coluna=palavra.substring(palavra.indexOf('<')+1,palavra.indexOf('>'));
					texto=palavra.substring(palavra.indexOf('>')+1,palavra.indexOf('/')-1);
					return "\""+coluna+"\":\""+texto+"\"%n";
				}
					
			}
			else if(palavra.length()-1==palavra.indexOf('>') & palavra.indexOf('/')==-1 & proxima.indexOf(tabela)==-1) 
			{
				return "{%n";
			}
			else if(palavra.length()-1==palavra.indexOf('>') & palavra.indexOf('/')!=-1 & proxima.indexOf(tabela)==-1) 
			{
				return "},%n";
			}
			else 
			{
				return "}%n]%n";
			}
		}
		else 
		{
			return "}%n}%n";
		}
				
	}

}
