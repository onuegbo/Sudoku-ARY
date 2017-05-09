# Sudoku-ARY
grille de sudoku
/**
 * @author onuegbo amaobi
 * Implemntation Standard d'une grille de sudoku
 */





/**
 *
 * Implementation
 *
 */

public class GrilleImp implements Grille {
	 int [] [] grille;
	int tailleGrille;
	@Override
	public  int getDimension() {
		
		int [] [] grille = new int [] []

				
			 	{'@','@','@','@','@','@','@','@','@'},
				{'@','@','@','@','@','@','@','@','@'},
				{'@','@','@','@','@','@','@','@','@'},
				
				{'@','@','@','@','@','@','@','@','@'},
				{'@','@','@','@','@','@','@','@','@'},
				{'@','@','@','@','@','@','@','@','@'},
				
				{'@','@','@','@','@','@','@','@','@'},
				{'@','@','@','@','@','@','@','@','@'},
				{'@','@','@','@','@','@','@','@','@'},
		 };

		tailleGrille = grille.length;

		return tailleGrille;
	}

	@Override
	public void setValue(int x, int y, char value)
			throws IllegalArgumentException {
		if ( x < 0 || x > 8 ) throw new IllegalArgumentException () ;
		if ( y < 0 || y > 8 ) throw new IllegalArgumentException () ;
		if ( value < 1 || value > 9 ) throw new IllegalArgumentException () ;
		
		grille[x][y]=value;
	}
	}

	@Override
	public char getValue(int x, int y) throws IllegalArgumentException {
		  return (char) grille [ x ] [ y ] ;
	}

	@Override
	public boolean complete() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	 public boolean possible(int x, int y, char value) throws IllegalArgumentException {
        if (x < 0 || y < 0 || x >= grille.length || y >= grille.length) {
            throw new IllegalArgumentException("L'un des index fournis est hors des bornes");
        }

        if (!estAutorise(value)) {
            throw new IllegalArgumentException("value n'est pas un caractere autorisé");
        }

        //Recherche d'une occurence du caractère dans la ligne
        for (int col = 0; col < grille.length; col++) {
            if (grille[x][col] == value) {
                return false;
            }
        }

        //Recherche d'une occurence du caractère dans la colone
        for (int row = 0; row < grille.length; row++) {
            if (grille[row][y] == value) {
                return false;
            }
        }

        //Recherche d'une occurence du caractère dans le petit carré local
        int taillePetitCarre = (int) Math.sqrt(grille.length);
        int incrementX = (x / taillePetitCarre) * taillePetitCarre;
        int incrementY = (y / taillePetitCarre) * taillePetitCarre;
        for (int row = 0; row < taillePetitCarre; row++) {
            for (int col = 0; col < taillePetitCarre; col++) {
                if (grille[row + incrementX][col + incrementY] == value) {
                    return false;
                }
            }
        }
        return true;
    }

	public static void main(final String [] args) {


	}



}
