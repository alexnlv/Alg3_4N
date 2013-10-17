import java.awt.Image;


public class Reta extends Shape{
		
	private Ponto p0;
	private Ponto p1;
	
				
	public void setVertices(Ponto p0, Ponto p1){
		
		this.p0 = p0;
		this.p1 = p1;
	}
	
	public void drawReta(Imagem img, Cor c) throws Exception{
		
		//Bresenham(Principal.imagem, c); bresenham é o algoritmo que pode ser pego na internet
				
		int dx= Math.abs(p1.x - p0.x);
		int dy= Math.abs(p1.y - p0.y);
		
		int err = dx - dy;
		int sx, sy;
		
		if (p0.x > p1.x) sx = -1;
		else sx = 1;

		if (p0.y > p1.y) sy = -1;
		else sy = 1;
		
		while (true){
			
			img.setPixel(p0, c);
			
			if (p0.x == p1.x && p0.y == p1.y) break;
			int e2 = 2 * err;

			if (e2 > - dy) {
			err = err - dy;
			p0.x = p0.x + sx;
			}
			img.setPixel(p0, c);
			if (p0.x == p1.x && p0.y == p1.y) break;

			if (e2 <dx) {
			err = err + dy;
			p0.y = p0.y + sy;
			
			}
				
		}
	
	}	

}
