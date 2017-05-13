
public class GrilleImpl implements Grille {

	 private final char grille[][];

	    public GrilleImpl(int dimension) {
	        grille = new char[dimension][dimension];
	        for (int i = 0; i < dimension; i++) {
	            for (int j = 0; j < dimension; j++) {
	                grille[i][j] = EMPTY;
	            }
	        }
	    }

	    @Override
	    public int getDimension() {
	        return grille.length;
	    }
	@Override
	public void setValue(int x, int y, char value) throws IllegalArgumentException {
		
		if (!possible(x, y, value)) {
            throw new IllegalArgumentException("la valeur est interdite aux vues des autres valeurs de la grille");
        }
        grille[x][y] = value;
	}

	@Override
	public char getValue(int x, int y) throws IllegalArgumentException {
		// TODO Auto-generated method stub
	  return (char) grille [ x ] [ y ] ;
	}

	@Override
	public boolean complete() {
		 for (int i = 0; i < grille.length; i++) {
	            for (int j = 0; j < grille.length; j++) {
	                if (grille[i][j] == EMPTY) {
	                    return false;
	                }
	            }
	        }
	        return true;
	}

	@Override
	public boolean possible(int x, int y, char value) throws IllegalArgumentException {
		 if (x < 0 || y < 0 || x >= grille.length || y >= grille.length) {
	            throw new IllegalArgumentException("L'un des index fournis est hors des bornes");
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
