package justiceLeagueInterface;

import justiceLeague.OuterSpace;
import justiceLeague.Meteor;
import java.util.ArrayList;


public interface IBatman {

	/** returns Batman's real name */
	public String getRealName();
	
	/** returns an ArrayList<Meteor>  */
	public ArrayList<Meteor> getMeteorsInSpace(OuterSpace space);
	
}
