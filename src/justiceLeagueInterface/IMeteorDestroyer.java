package justiceLeagueInterface;

import justiceLeague.Meteor;

public interface IMeteorDestroyer {

	/** adds a type Meteor to the MeteorDestroyer */
	public void addMeteorToDestroy(Meteor meteorToDestroy);
	
	/** returns the Meteor closest to Earth */
	public Meteor getClosestMeteor();
	
	/** returns the number of Meteors in the MeteorDestroyer */
	public int getSize();
	
	/** returns true if the MeteorDestroyer has meteors to destroy */
	public boolean hasMeteors();
}
