package justiceLeagueInterface;

import java.util.ArrayList;

import justiceLeague.Meteor;
import justiceLeague.OuterSpace;

public interface ISuperman {

	/** returns a string */
	public String getRealName();

	/** destroys the meteors in OuterSpace */
	public void destroyMeteorsInSpace(ArrayList<Meteor> meteorList, OuterSpace space);

}
