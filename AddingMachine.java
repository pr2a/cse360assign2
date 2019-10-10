/* Author: Priya Ganguly
 * Class ID: 85141
 * Assignment: 2
 * Description: performs the add and subtract mathematical function using integer numbers
 */

package cse360assign2;

/** Adding Machine is a class that starts with 0 and has some integers added and subtracted to
 * it; as the history is recorded, it is then printed at the end of the machine.
 * 
 * @author priyaganguly
 * @version 1.0
 */
public class AddingMachine {

	/** This is a global variable: {@link #total} */
	private int total;
	
	/** This is a global variable: {@link #history} */
	private String history;
	
	/** Class constructor initializes the total to 0
	 * @return args Unused.
	 */
	public AddingMachine() {
		total = 0;
	}
	
	/** returns the current total 
	 * @param args Unused.
	 * @return int This returns the total answer after the operations are applied.
	 */
	public int getTotal() {
		return total;
	}
	
	/** This method is used to add an integer to the total. 
	 * @param value This is the parameter for the add method.
	 */
	public void add(int value) {
		total = total + value;
		history = history + " + " + value;
		
	}
	
	/** This method is used to subtract an integer from the total. 
	 * @param value This is the parameter for the subtract method.
	 */
	public void subtract(int value) {
		total = total - value;
		history = history + " - " + value;
	}
	
	/** This method returns the entire operation done
	 * @param args Unused.
	 * @return string This returns a string
	 */
	public String toString() {
		return history;
	}
	
	/** This method resets the calculation history.
	 * @param args Unused.
	 */
	public void clear() {
		total = 0;
		history = "0";
	}
}