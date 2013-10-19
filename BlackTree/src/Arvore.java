
public class Arvore {
	
	private String chave;
	private String valor;
	private Nodo raiz;
	private Nodo tio;
	private Nodo avo;
	
	
	public void insere(String chave, String valor){
			
		Nodo N = new Nodo();
		
		N.insere(chave.hashCode(), valor);
		
		if(raiz.equals(null)){
			
			N.setBlack(true);
			raiz = N;
			return;
		}
		// Se o hash é maior entao insere na direita
		if(chave.hashCode()> raiz.getChave()){
			
			raiz.setDir(N);
			
		}
		// Se o hash é menor entao insere na esquerda
		if(chave.hashCode() < raiz.getChave()){
			
			raiz.setEsq(N);
		}
		
		
		
		
		
	}
	
	/*public String getValor(String chave){
	
		return valor;
	}*/
	
	public void remover(String chave){
		
		
	}
	

}
