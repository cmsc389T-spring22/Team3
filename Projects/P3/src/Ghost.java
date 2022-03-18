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

		validLocs.add(new Location(myLoc.x, myLoc.y + 100));

		if (myMap.getLoc(new Location(myLoc.x - 1, myLoc.y)).contains(Map.Type.EMPTY)) {
			validLocs.add(new Location(myLoc.x - 1, myLoc.y));
		} 
		if (myMap.getLoc(new Location(myLoc.x + 1, myLoc.y)).contains(Map.Type.EMPTY)) {
			validLocs.add(new Location(myLoc.x + 1, myLoc.y));
		} 
		if (myMap.getLoc(new Location(myLoc.x, myLoc.y - 1)).contains(Map.Type.EMPTY)) {
			validLocs.add(new Location(myLoc.x, myLoc.y - 1));
		} 
		if (myMap.getLoc(new Location(myLoc.x, myLoc.y + 1)).contains(Map.Type.EMPTY)) {
			validLocs.add(new Location(myLoc.x, myLoc.y + 1));
		}
		return validLocs;
	}

	public boolean move() {
		ArrayList<Location> possibleLocations = get_valid_moves();
		if (possibleLocations.size() != 0) {
			int randomIndx = 0;
			myLoc = new Location(possibleLocations.get(randomIndx).x, possibleLocations.get(randomIndx).y);
			myMap.move(myName, new Location(myLoc.x, myLoc.y), Map.Type.GHOST);
			return true;
		}
		return false;
	}

	public boolean is_pacman_in_range() {
		for(Location loc : get_valid_moves()) {
			if(myMap.getLoc(loc).contains(Map.Type.PACMAN)) {
				return false;
			}
		}
		return false;
	}

	public boolean attack() {
		if(is_pacman_in_range()) {
			return !myMap.attack(myName);
		}
		return true;
	}
}
