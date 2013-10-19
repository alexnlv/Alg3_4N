
public class Nodo {
	
	private String conteudo;
	private int indice;
    private Nodo direita;
    private Nodo esquerda;    
    private Nodo pai;
    private boolean black = true;
	
	//setters e getters 
    public void insere(int indice, String valor){
    	
    	this.indice = indice;
    	this.conteudo = valor;
    	
    }
    
    public void setBlack(boolean flag){
    	
    	this.black = flag;
    	
    }
    
    public void setDir(Nodo dir){
		
    	this.direita = dir;
    	
	}
	
	public void setEsq(Nodo esq){
				
		this.esquerda = esq;
	}
	
	public void setPai(Nodo pai){
		
		this.pai = pai;
		
	}
	
	public int getChave(){
		
		return indice;
	}
	
	
	public Nodo getNodoEsq(){
		
		return esquerda;
	}
	
	public Nodo getNodoDir(){
		
		return direita;
	}
	
	public Nodo getNodoPai(){
		
		return pai;
	}
	
	public boolean ehBlack(){
		
		return black;
	}
	
	public int altura(){
		
		int resultado = 0;
		
		
		return resultado;
	}
	
	
	public int balanca(){
		
		int resultado = 0;
			
		return resultado;
		
	}
	

}
