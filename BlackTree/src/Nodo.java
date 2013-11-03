
public class Nodo {
	
	public String conteudo;
	public int indice, altura;
	public Nodo direita, esquerda, pai;
	public boolean black = true;
	
	public Nodo(int indice, String valor) {
		
		this.indice = indice;
    	this.conteudo = valor;

	}
    
}
