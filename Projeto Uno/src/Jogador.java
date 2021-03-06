import java.util.ArrayList;

import org.omg.CORBA.PUBLIC_MEMBER;


public class Jogador {
	
	private String nome;
	private ArrayList<String> cartas = new ArrayList<String>();
	
	
	public void setNome(String nome) {
		
		this.nome = nome;
		
	}
	
	public String getNome(){
		
		return this.nome;
	}
	

	public String selecionarCarta(int posicao){
		
		String carta;
		
		carta = cartas.get(posicao).toString();
		
		return carta;
		
	}
	
	public void comprarCarta(String receberCarta){
		
		cartas.add(receberCarta);
	}
	
	public ArrayList<String> mostrarCartas(){
		
		return cartas;
	}
	
	public boolean contemCarta(String cartaSelecionada) {
		
		boolean resultado = false;
		
		if(cartas.contains(cartaSelecionada)){
			
			resultado = true;
		
		}
		
		return resultado;

	}
	
	
	public void removeCarta(int indice){
		
		cartas.remove(indice);
		
	
	}
	
	public int qtdeCartas(){
		
		return cartas.size();
			
	}

}
