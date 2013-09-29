
public class Cor {
	
	public int R = 0;
	public int G = 0;
	public int B = 0;
	public int gray = 0;
	
	public Cor() {
		
		if(gray < 0) gray = 0;
		if(gray > 255) gray = 255;
		if(R < 0) R = 0;
		if(R > 255) R = 255;
		if(G < 0) G = 0;
		if(G > 255) G = 255;
		if(B < 0) B = 0;
		if(B > 255) B = 255;
	}
	
	
}
