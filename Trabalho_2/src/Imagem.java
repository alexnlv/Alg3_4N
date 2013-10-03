
public class Imagem {
	
	private Cor cor;
	private int height;
	private int width;
	private int[][] image;
	
	public Imagem(int height, int width, Cor cor){
		
		this.height = height;
		this.width = width;
		this.cor = cor;
	}
	
	public void setPixel(Ponto p, Cor c) throws Exception{
	
		if (p.x < 0 || p.x >= width) {
			throw new Exception("x out of range");
			}
		if (p.y < 0 || p.y >= height) {
			throw new Exception("y out of range");
			}
		
		//image[p.x][p.y] = c.gray;
		
	}
	
	public void addShape(Shape s, Cor c){
		
		s.draw(c, this);
	
	}

}
