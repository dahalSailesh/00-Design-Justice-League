package justiceLeague;

import java.util.ArrayList;

public class Superman{
	private String name;
	private MeteorDestroyer destroyer = new MeteorDestroyer();
	
	// Constructor	
	public Superman() {
		this.name = "Clark Kent";
	}
	
	// Global Variables	
	private Meteor[][] spaceGrid;
	
	
	
	public String getRealName() {
		return this.name;
	}
	
	public void destroyMeteorsInSpace(ArrayList<Meteor> meteorList, OuterSpace space){
		spaceGrid = space.getSpaceGrid();
		for(Meteor meteor : meteorList) {
			destroyer.addMeteorToDestroy(meteor);
		}
		destroyMeteors();
	}
	
	private void destroyMeteors() {	
		Meteor closestMeteor;
		int meteorXpos;
		int meteorYpos;
		while(destroyer.hasMeteors()) {
			closestMeteor = destroyer.getClosestMeteor();
			meteorXpos = closestMeteor.xPos();
			meteorYpos = closestMeteor.yPos();
			spaceGrid[meteorXpos][meteorYpos] = null;
		}
	}
		
}
