
public class Cor {
	
	public int red = 0;
	public int green = 0;
	public int blue = 0;
	public int gray = 0;
	
	public Cor(int r, int g, int b) {
		
		if(r < 0) r = 0;
		if(r > 255) r = 255;
		if(g < 0) g = 0;
		if(g > 255) g = 255;
		if(b < 0) b = 0;
		if(b > 255) b = 255;
		
		this.red = r;
		this.green = g;
		this.blue = b;
		
	}
	
	public Cor(int gray){
		
		if(gray < 0) gray = 0;
		if(gray > 255) gray = 255;
		
		this.gray = gray;
		
		
	}
	
	
}
