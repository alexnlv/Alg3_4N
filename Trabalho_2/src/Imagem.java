import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Imagem {
	
	private Cor cor;
	private int height;
	private int width;
	private int[][] image;
	
	public Imagem(int height, int width, Cor cor){
		
		this.height = height;
		this.width = width;
		this.cor = cor;
		this.image = new int [height][width];
	}
	
	public void setPixel(Ponto p, Cor c) throws Exception{
		
		image[p.x][p.y]= c.gray;
		
	}
	
	public void addShape(Shape s, Cor c){
		
		s.draw(c, this);
	
	}
	
	public int getPixel(int x, int y) {
		
		return image[x][y];
	}
	public void Salvar(String filename) throws IOException {
		BufferedWriter out = new BufferedWriter( new FileWriter(filename + ".pnm") );

		
			out.write(String.format("P2\n%d %d\n255\n", image[0].length, image[0].length));
		

		for (int[] linha : image) {
			for (int v : linha){
				out.write(String.format("%d ", v));
			}
		}	
		out.close();
	}

}
