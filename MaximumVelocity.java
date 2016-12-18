package programming.set7.sudoku;

public class Sudoku extends NumberBoard {

private static final int rows = 9;
private static final int columns = 9;


	public Sudoku() {
		super(9, 9);	
	}
	
	//Erzeugt ein neues Board neun Zeilen und neun Spalten.
	
	public void setValueAt(int row, int col, int value){
		if ((value >0 && value <10) || (value == NumberBoard.EMPTY)) {
			super.setValueAt(row, col, value);
		}
	}
	
	//Prüft Zeilen und Gitter seperat und gibt wenn beide gültig sind "true", andernfalls "false" aus.
	
	public boolean validRow(){
		int[] row = new int[9];
		for (int g = 0; g < row.length; g++) {
			for (int i = 0; i < row.length; i++) {
				row[i] = getValueAt(g , i);
			} 
			for (int v = 0; v < row.length; v++) {
				for (int t = 0; t < row.length; t++) {
					if (row[v] == row[t]){
						return false;
					}
					
				}
			}
		} 
		return true;
	}
	
	public boolean validCol(){
		
	}
	
	public boolean validGrid(){
		
	}
	
	public boolean isValid() {
		return(validRow() && validCol() && validGrid());	
	}
}





