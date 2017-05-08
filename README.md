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
	public boolean possible(int x, int y, char value)
		for (int i=0;i<tailleGrille;i++){
		    for (int j=0;j<tailleGrille;j++){
			if (grille[x][i]==value || grille[y][j]==value)
				return false;
		    }
		}
		return true;
	}


	public static void main(final String [] args) {


	}



}
