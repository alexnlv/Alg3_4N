
public class Circulo extends Shape{
	
	int raio;
	private Ponto centro = new Ponto();
	private Ponto p  = new Ponto();
	public void setCentro(Ponto p){
		
		this.centro = p;
		
	}

	public void setRaio(int r){
		this.raio = r;
	}
	
	public void drawCirculo( Cor c, Imagem img ) throws Exception {
		int x = 0;
	    int y = raio;
	    int u = 1;
	    int v = 2 * raio - 1;
	    int E = 0;
		
	    while ( x < y ) {
	    	
	   
			p.x = centro.x + x;
			p.y = centro.y + y;
			img.setPixel(p, c);

			p.x = centro.x + y;
			p.y = centro.y - x;
			img.setPixel(p, c);

			p.x = centro.x - x;
			p.y = centro.y - y;
			img.setPixel(p, c);

			p.x = centro.x - y;
			p.y = centro.y + x;
			img.setPixel( p, c );

		    x++; E += u; u += 2;
		    
		    if (v < 2 * E){
		    	y--; 
		    	E -= v; 
		    	v -= 2;
		    }
		    
		    if (x > y) break;

			p.x = centro.x + y;
			p.y = centro.y + x;
			img.setPixel(p, c);

			p.x = centro.x + x;
			p.y = centro.y - y;
			img.setPixel(p, c);

			p.x = centro.x - y;
			p.y = centro.y - x;
			img.setPixel(p, c);

			p.x = centro.x - x;
			p.y = centro.y + y;
			img.setPixel(p, c);
	    }
	   
	}
}
