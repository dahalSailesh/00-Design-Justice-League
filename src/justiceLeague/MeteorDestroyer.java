package justiceLeague;

import java.util.PriorityQueue;

public class MeteorDestroyer {
	private PriorityQueue<Meteor> destroyMeteorQ;
	
	// Constructor	
	public MeteorDestroyer() {
		this.destroyMeteorQ = new PriorityQueue<Meteor>();
	}
	
	
	
	public void addMeteorToDestroy(Meteor meteorToDestroy) {
		this.destroyMeteorQ.add(meteorToDestroy);
	}
	
	public Meteor getClosestMeteor() {
		return this.destroyMeteorQ.poll();
	}
	
	public int getSize() {
		return this.destroyMeteorQ.size();
	}
	
	public boolean hasMeteors() {
		return this.destroyMeteorQ.size() != 0;
	}
	
}
