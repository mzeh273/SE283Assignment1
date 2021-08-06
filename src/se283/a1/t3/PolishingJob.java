package se283.a1.t3;

/**
 * [ADD COMMENTS] Describe the class
 * Class contains duplicate code and feature envy smells
 * 
 * @author Author Name: [YOUR NAME] Author UPI: [YOUR UPI]
 * @version Date: [CURRENT DATE] 
 * 
 * [Explain the changes made and their rationale. 
 * This description may overlap with the contents of commit messages]
 * The line determining the floorArea was duplicated between this class and the cleaningMachine class.
 * It also represents feature envy, as it would be much better off in the Floor class.
 * to fix this smell, I have extracted the code and moved it to the floor class.
 * 
 * Note: You may create new classes, methods or fields in this package
 *
 */

public class PolishingJob{
	double polishingRent(Floor floor, PolishingMachine polisher) {
		double electricityPerUnitArea = floor.getCondition() * polisher.getCapability();
		double energyConsumption = electricityPerUnitArea * floor.floorArea;
		return energyConsumption * polisher.costPerUnitElectricity();
	}
}