package cr.ed.ulacit.cicc.programa;

import javax.swing.JOptionPane;

import cr.ed.ulacit.cicc.vectores.ArrayUtil;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] vec = {'C', 'I', 'C', 'C'};
		
		ArrayUtil util = new ArrayUtil();
		
		System.out.println(util.vecToString(vec));
		vec = util.copyWithRezise(vec, 10);
		System.out.println(util.vecToString(vec));
		//JOptionPane.showMessageDialog(null, util.vecToString(vec));
		
	}

}
