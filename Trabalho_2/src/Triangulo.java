
public class Triangulo extends Shape{
	
	
	public Triangulo(Ponto p0, Ponto p1, Ponto p2) {
		// TODO Auto-generated constructor stub
	}

	public void setVertices(Ponto p0, Ponto p1, Ponto p2){
		
	}
	
	public void draw(Cor c){
		
		Reta r1 = new Reta(v0, v1);
		Reta r2 = new Reta(v1, v2);
		Reta r3 = new Reta(v2, v0);
		
		Imagem img = Principal.imagem;
		img.addShape(r1, c);
		img.addShape(r2, c);
		img.addShape(r3, c);
		
	}

}
