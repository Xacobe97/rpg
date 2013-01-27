import java.util.Random;

public class Map {

	int coordenadas[][] = new int[64][64];

	public void crearmapa() {	
		Random rand = new Random();
		int i, ii;

		for (ii = 0; ii < 10; ii++) {
			for (i = 0; i < 10; i++) {

				int o = rand.nextInt( 2 - 1 + 1 );
				coordenadas[ii][i] = o;
				System.out.print(coordenadas[ii][i]);

			}
			
			System.out.println("");
			
		}
	}
	
	int ii = 0;
	int i = 0;
	int valor = 0;

	public void setMapa(int ii, int i, int valor) {

		this.ii = ii;
		this.i = i;
		this.valor = valor;

		coordenadas[ii][i] = valor;

	}
}

