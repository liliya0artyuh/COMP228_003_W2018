/**
 * 
 */
package joptionpane;

import javax.swing.JOptionPane;

/**
 * @author lartyukh
 *
 */
public class jPane {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = JOptionPane.showInputDialog("What is your name?");
		String message =  String.format("Welcome, %s, to Java Programming!", name);
		JOptionPane.showMessageDialog(null, message);
	}

}
