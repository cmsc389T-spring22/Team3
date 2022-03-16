import java.util.HashSet;
import java.util.ArrayList;
import javax.swing.JComponent;

public class PacMan{
	String myName;
	Location myLoc;
	Map myMap;
	Location shift; 

	public PacMan(String name, Location loc, Map map) {
		this.myLoc = loc;
		this.myName = name;
		this.myMap = map;
	}

	public ArrayList<Location> get_valid_moves() {
		ArrayList<Location> validLocs = new ArrayList<Location>();
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
		ArrayList<Location> validMoves = new ArrayList<Location>();
		validMoves.add(new Location(myLoc.x + 5, myLoc.y));
		if(!validMoves.isEmpty()) {
			return myMap.move(myName, validMoves.get(0), Map.Type.PACMAN);
		}
		return false;
	}

	public boolean is_ghost_in_range() { 
		if (myMap.getLoc(myLoc.shift(0, 1)).contains(Map.Type.GHOST)) {
			return false;
		}
		else if (myMap.getLoc(myLoc.shift(1, 1)).contains(Map.Type.GHOST)) {
			return false;
		}
		else if (myMap.getLoc(myLoc.shift(-1, 0)).contains(Map.Type.GHOST)) {
			return false;
		}
		else if (myMap.getLoc(myLoc.shift(-1, -1)).contains(Map.Type.GHOST)) {
			return false;
		}

		return false;
	}

	public JComponent consume() { 
 		return null;
	}
}
