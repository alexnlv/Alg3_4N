
public class Principal {

	
	public static void main(String[] args) {


		int[][] mat = new int[2][3];
		int[][][] cubo = new int[2][3][3];
		
		PNMFile f = new PNMFile(16, 16);
		try {
			for (int x = 0; x < 16; x++) {
				for (int y = 0; y < 16; y++) {
				
				
					f.setPixel(x, y, (x+y*16));
				}
			
			}	
			
		} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
			
			
		}
		
		f.printImage(System.out);
		
	}

}
