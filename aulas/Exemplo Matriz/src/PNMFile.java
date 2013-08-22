import java.io.PrintStream;


public class PNMFile  { //portable notable meta file

	private int width;
	private int heigth;
	private int[][] image;
	
	public PNMFile(int width, int heigth){
		
		this.width = width;
		this.heigth = heigth;
		this.image = new int [width][heigth];
		
	}
	
	public void setPixel(int x, int y, int gray) throws Exception{
		
		if(gray < 0) gray = 0;
		if(gray > 255) gray = 255;
		if(x < 0 || x >= width)
			throw new Exception("x out of range");
		if(y < 0 || y >= heigth)
			throw new Exception("y out of range");
		
		image[x][y] = gray;
	}
	
	
	public void printImage(PrintStream out){
		
		out.println(String.format("P2\n%d  %d\n255\n", width, heigth));
		
		
		for (int x = 0; x < width; x++) {
			
			for (int y = 0; y < heigth; y++) {
				
				out.print(getPixel(x, y));
				out.print(" ");
			}
			
		}
		
	}

	private int getPixel(int x, int y) {
		
		return image[x][y];
	}
	
	
}
