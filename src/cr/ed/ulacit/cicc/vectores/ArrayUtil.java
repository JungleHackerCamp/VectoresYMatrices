/**
 * 
 */
package cr.ed.ulacit.cicc.vectores;

/**
 * @author pedro
 */
public class ArrayUtil {
	
	/**
	 * 
	 * @param old
	 * @param newSize
	 * @return
	 */
	public char[] copyWithRezise(char[] old, int newSize){
		char[] nuevoVector = new char[newSize];
		for(int i = 0; i < old.length;++i){
			nuevoVector[i] = old[i];
		} // FOR ENDS
		return nuevoVector;
	} // METHOD ENDS
	
	/**
	 * 
	 * @param vec
	 * @return
	 */
	public String vecToString(char[] vec){
		String vecString = "";
		if(vec.length > 0){
			for(int i = 0; i< vec.length; ++i){
				vecString+= "|" + vec[i] + "|";
			} // FOR ENDS
		} // IF ENDS
		return vecString;
	}

}
