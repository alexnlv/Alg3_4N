import java.util.ArrayList;
import java.util.Collections;


public class Baralho {
	
	public ArrayList<String> cartas = new ArrayList<String>();
	
	public Baralho(){
		
		String[] naipe = {"O", "C", "E","P"};
		String[] valor = {"A","2","3","4","5","6","7","8","9","X","J","Q","K"};
		
		for (int i = 0; i < naipe.length; i++) {
			
			for (int j = 0; j < valor.length; j++) {
				
				cartas.add(valor[j].toString() + naipe[i].toString());
			}
			
		}
		
	}

	public void embaralhar(){
		
		Collections.shuffle(cartas);
		
	}
	
	
}
