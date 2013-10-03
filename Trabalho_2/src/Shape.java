
public abstract class Shape {
	
	private Imagem imagem;
	private Cor c;
	
	
	public void draw(Cor c, Imagem imagem){
		
		this.c = c;
		this.imagem = imagem;
		
	}

}
