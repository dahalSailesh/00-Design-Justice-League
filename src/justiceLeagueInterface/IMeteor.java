package justiceLeagueInterface;

public interface IMeteor {

	/** returns the meteor's distance to Earth */
	public double getDistanceToEarth();
	
	/** returns the x-position of the meteor on the space grid */
	public int xPos();
	
	/** returns the y-position of the meteor on the space grid */
	public int yPos();
	
}
