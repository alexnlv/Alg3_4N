
public class Reta extends Shape{
	
	public void setVertices(Ponto p0, Ponto p1){
		
		Imagem img = new Imagem();
		
		int dx= Math.abs(p1.x - p0.x);
		int dy= Math.abs(p1.y - p0.y);
		
		int err = dx - dy;
		int sx, sy;
		
		if (p0.x > p1.x) sx = -1;
		else sx = 1;

		if (p0.y > p1.y) sy = -1;
		else sy = 1;
		
		while (true){
			
			
			//img.setPixel (p0);
			if (p0.x == p1.x && p0.y == p1.y) break;
			int e2 = 2 * err;

			if (e2 > - dy) {
			err = err - dy;
			p0.x = p0.x + sx;
			}
			//img.setPixel (p0);
			if (p0.x == p1.x && p0.y == p1.y) break;
			//img.setPixel (); break;

			if (e2 <dx) {
			err = err + dy;
			p0.y = p0.y + sy;
			}

		}
	
	}	

}
