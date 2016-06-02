/**
 * 
 */
package cr.ed.ulacit.cicc.vectores;

/**
 * @author Pedro Guzmán
 *
 */
public class TableroDeAjedrez {
	
	public static final char PEON = 'P';
	public static final char TORRE = 'T';
	public static final char CABALLO = 'C';
	public static final char ALFIL = 'A';
	public static final char REY = 'K';
	public static final char REINA = 'Q';
	
	// Atributos de la clase
	
	private char[][] tablero;
	
	/**
	 * 
	 */
	public TableroDeAjedrez(){
		// Se inicializa el tablero de ajedréz
		this.tablero = new char[8][8];
	} // CONSTRUCTOR METHOD ENDS ------------------------------------------------------------------ // 
	
	public void init(){
		this.tablero[7][0] = TORRE;
		this.tablero [7][7] = TORRE;
	}
	
	public String toString(){
		String ts = "";
		return ts;
	}

}
