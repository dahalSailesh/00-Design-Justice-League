package justiceLeague;

import justiceLeagueInterface.IBatman;
import java.util.ArrayList;


public class Batman implements IBatman{
	private String name;
	
	// Constructor	
	public Batman() {
		this.name = "Bruce Wayne";
	}
	
	// Global Variables
	private ArrayList<Meteor> meteorList;
	private Meteor[][] spaceGrid;
	
	
	
	public String getRealName() {
		return this.name;
	}
	
	public ArrayList<Meteor> getMeteorsInSpace(OuterSpace space) {
		meteorList = new ArrayList<Meteor>();
		spaceGrid = space.getSpaceGrid();
		Meteor potentialMeteor;
		
		for(int i = 0; i < spaceGrid.length; i++) {
			for(int j = 0; j < spaceGrid.length; j++) {
				potentialMeteor = space.getObjectAtCoords(i, j);
				if(potentialMeteor != null) {
					meteorList.add(potentialMeteor);
				}
			}
		}
		
		return meteorList;
	}
}
