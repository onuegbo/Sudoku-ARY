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

	@Override
	public  int getDimension() {
		// TODO Auto-generated method stub
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

		int tailleGrille = grille.length;
		char [][] grilleValue = new char [9] [9];

		return tailleGrille;
	}

	@Override
	public void setValue(int x, int y, char value)
			throws IllegalArgumentException {
		// TODO Auto-generated method stub

	}

	@Override
	public char getValue(int x, int y) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean complete() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean possible(int x, int y, char value)
			throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return false;
	}


	public static void main(final String [] args) {


	}



}
