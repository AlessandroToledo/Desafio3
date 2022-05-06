package model;

public class Validar {
	
	Pilha pilha = new Pilha();
	
	public boolean Validacao(String validar) {
			
		  int tamlinha=validar.length();
		  for(int i=0;i<tamlinha;i++)
		  {
			  if(validar.charAt(i)=='<')
			  {
				  pilha.empilhar(validar.charAt(i));	
			  }
			  else if(pilha.pilhaVazia()==false)
			  {
				  if(validar.charAt(i)=='>' && pilha.exibeUltimoValor()=='<')
	    		  {
	    			  pilha.desempilhar();
	    		  }
			  }
		
		  }
		  for(int i=0;i<tamlinha;i++)
	  	  {
	  		  if(validar.charAt(i)=='<')
	  		  {
	  			  pilha.empilhar(validar.charAt(i));	
	  		  }
	  		  else if(pilha.pilhaVazia()==false)
	  		  {
	  			  if(validar.charAt(i)=='/' && pilha.exibeUltimoValor()=='<')
		    		  {
		    			  pilha.desempilhar();
		    			  pilha.desempilhar();
		    		  }
	  		  }
			
	  	  }
		  if(pilha.pilhaVazia()==true)
		  {
			  System.out.print("Arquivo Valido");
			  return true;
		  }
		  else
		  {			  
			  System.out.print("Arquivo Invalido");
			  return false;
		  }
		  
	}
	
}
