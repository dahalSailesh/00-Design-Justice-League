package justiceLeagueInterface;

import justiceLeague.Meteor;

public interface IOuterSpace {

	/** returns 100; the size of OuterSpace */
	public int getSize();

	/** returns type Meteor or null at position x,y of OuterSpace */
	public Meteor getObjectAtCoords(int x, int y);

	/** returns a Meteor[][] with a size of 100 */
	public Meteor[][] getSpaceGrid();

	/** returns the number of Meteors in OuterSpace */
	public int countMeteors();
}
