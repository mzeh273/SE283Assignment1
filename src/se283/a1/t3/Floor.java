package se283.a1.t3;

/**
 * [ADD COMMENTS] Describe the class
 * 
 * @author Author Name: [YOUR NAME] Author UPI: [YOUR UPI]
 * @version Date: [CURRENT DATE] 
 *
 * [Explain the changes made and their rationale. 
 * This description may overlap with the contents of commit messages]
 * As the line determining floorArea was being repeated and would fit better in this class, I have extracted it
 * from PolishingJob and CleaningJob classes and moved it into this class
 * 
 * Note: You may create new classes, methods or fields in this package
 *
 */

public class Floor {

	public int length() {
		// length of the floor
		return 21;
	}

	public int width() {
		// width of the floor
		return 45;
	}

	public int getCondition() {
		// Current condition of the floor rated on the scale of 1 (worst) to 10 (best)
		return 5;
	}
	double floorArea = length() * width();


}
