import java.util.HashSet;
import java.util.ArrayList;

public class Ghost{
	String myName;
	Location myLoc;
	Map myMap;

	public Ghost(String name, Location loc, Map map) {
		this.myLoc = loc;
		this.myName = name;
		this.myMap = map;
	}

	public ArrayList<Location> get_valid_moves() {
		ArrayList<Location> validLocs = new ArrayList<Location>();
		if (myMap.move(myName, new Location(myLoc.x - 1, myLoc.y), GHOST)) {
			validLocs.add(new Location(myLoc.x - 1, myLoc.y));
		}
		if (myMap.move(myName, new Location(myLoc.x + 1, myLoc.y), GHOST)) {
			validLocs.add(new Location(myLoc.x + 1, myLoc.y));
		}
		if (myMap.move(myName, new Location(myLoc.x, myLoc.y - 1), GHOST)) {
			validLocs.add(new Location(myLoc.x, myLoc.y - 1));
		}
		if (myMap.move(myName, new Location(myLoc.x, myLoc.y + 1), GHOST)) {
			validLocs.add(new Location(myLoc.x, myLoc.y + 1));
		}
		return validLocs;
	}

	public boolean move() {
		return false;
	}

	public boolean is_pacman_in_range() { 
		return false;
	}

	public boolean attack() {
		return false;
	}
}