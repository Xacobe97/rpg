import java.util.Random;

public class Map {

String coordenadas[][] = new String[20][20];
int ii = 0;
int i = 0;
int valor = 0;
Random r = new Random();
int randa, randb, map;
int counta = 0;
int countb = 0;
String letter;

public void setMap(int ii, int i, String value) {

	this.ii = ii;
	this.i = i;
	
	ii--;
	i--;
	coordenadas[ii][i] = value;
	
	}

public void createMap() {

	for (i = 0; i < 3; i++) {
		
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
	}
}

public void waterBiome() {
	
	letter = "W";
	randa = r.nextInt( 10 - 1 + 1 );
	randb = r.nextInt( 20 - 1 + 1 );
	
	for (ii = 0; ii < randa; ii++) {
		for (i = 0; i < randb; i++) {
			coordenadas[ii][i] = letter;
			System.out.print(coordenadas[ii][i]);
			}
		System.out.println("");
		}
	}

public void desertBiome() {
	
	letter = "D";
	randa = r.nextInt( 5 - 1 + 1 );
	randb = r.nextInt( 10 - 1 + 1 );
	
	for (ii = 0; ii < randa; ii++) {
		for (i = 0; i < randb; i++) {
			coordenadas[ii][i] = letter;
			System.out.print(coordenadas[ii][i]);
			}
		System.out.println("");
		}
	}

public void jungleBiome() {
	
	letter = "J";
	randa = r.nextInt( 5 - 1 + 1 );
	randb = r.nextInt( 10 - 1 + 1 );
	
	for (ii = 0; ii < randa; ii++) {
		for (i = 0; i < randb; i++) {
			coordenadas[ii][i] = letter;
			System.out.print(coordenadas[ii][i]);
			}
		System.out.println("");
		}
	}

public void printMap() {
	
	for (ii = 0; ii < 20; ii++) {
		for (i = 0; i < 20; i++) {
			System.out.print(coordenadas[ii][i]);
			}
		System.out.println("");
		}
	}
}

