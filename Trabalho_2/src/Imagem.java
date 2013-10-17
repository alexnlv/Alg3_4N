import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Imagem {
	
	private boolean grayscale;
	private Cor[][] data;
	
	public Imagem(int height, int width, boolean grayscale) throws Exception{
		
		if(height <= 0) throw new Exception("Altura invalida");
		if(width <= 0) throw new Exception("Largura invalida");
		this.grayscale = grayscale;
		this.data = new Cor[height][width];
		
	}
	
	public void setPixel(int x, int y, Cor c) throws Exception{
		
		if(x<0 || x> getWidth()) return;
		if(y<0 || y> getHeight()) return;
		
		data[x][y]= c;
		
	}
	
	public void addShape(Shape s, Cor c){
		
		s.draw(c);
	
	}
	
	/*public int getPixel(int x, int y) {
		
		return image[x][y];
	}*/
	
	public int getWidth(){
		
		return data.length;
	}
	
	public int getHeight(){
		
		return data[0].length;
	}
	
	public boolean getGrayscale(){
		
		return grayscale;
	}
	
	public Cor getPixel(int x, int y) throws Exception{
		
		if(x < 0 || x > getWidth()) throw new Exception("Erro no acesso");
		if(y < 0 || y > getHeight()) throw new Exception("Erro no acesso");
		Cor c = data[x][y];
		
		if (c == null){
		
		}
		return c;
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
