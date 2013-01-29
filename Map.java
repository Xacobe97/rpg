import java.util.Random;

public class Map {

String coordenadas[][] = new String[50][50];
int ii = 0;
int i = 0;
int valor = 0;
Random r = new Random();
int a, b, randa, randb, map;
int counta = 0;
String letter;
int countb = 0;

public void setMapa(int ii, int i, String valor) {

	this.ii = ii;
	this.i = i;
	
	coordenadas[ii][i] = valor;
	}

public void createMap() {
	
	i = 0;
	while (i < 3) {
		
		map = r.nextInt(10 - 1 + 1);
	
		switch (map) {
		case 1:
			waterBiome();
		case 2:
			waterBiome();
		case 3:
			waterBiome();
		case 4:
			waterBiome();
		case 5:
			waterBiome();
		case 6:
			waterBiome();
		case 7:
			desertBiome();
		case 8:
			desertBiome();
		case 9:
			jungleBiome();
		case 10:
			jungleBiome();
		}
		i++;
	}
}

public void waterBiome() {
	
	letter = "W";
	randa = r.nextInt( 20 - 1 + 1 );
	randb = r.nextInt( 20 - 1 + 1 );
	
	for (a = 0; a < randa; a++) {
		for (b = 0; b < randb; b++) {
			coordenadas[a][b] = letter;
			System.out.print(coordenadas[a][b]);
			}
		System.out.println("");
		}
	}

public void desertBiome() {
	
	letter = "D";
	randa = r.nextInt( 15 - 1+ 1 );
	randb = r.nextInt( 15 - 1 + 1 );
	
	for (a = 0; a < randa; a++) {
		for (b = 0; b < randb; b++) {
			coordenadas[a][b] = letter;
			System.out.print(coordenadas[a][b]);
			}
		System.out.println("");
		}
	}

public void jungleBiome() {
	
	letter = "J";
	randa = r.nextInt( 5 - 1+ 1 );
	randb = r.nextInt( 5 - 1 + 1 );
	
	for (a = 0; a < randa; a++) {
		for (b = 0; b < randb; b++) {
			coordenadas[a][b] = letter;
			System.out.print(coordenadas[a][b]);
			}
		System.out.println("");
		}
	}

}

