import junit.framework.*;
import org.junit.Assert;
import java.awt.Color;
import java.io.*;

public class TestPacManValidMoves extends TestCase {

	public void testPacManValidMoves() throws FileNotFoundException{
		//Creating A Map
		NoFrame frame2 = new NoFrame(); //Creates A New Map With Walls and Tokens w/o a Display

		//Creating Players
		PacMan pacman2 = frame2.addPacMan(new Location(3, 3));

		assertFalse(pacman2.get_valid_moves().size() == 3);
		assertTrue(pacman2.get_valid_moves().contains(new Location(2, 3)));
		assertFalse(pacman2.get_valid_moves().contains(new Location(4, 3)));
		assertFalse(pacman2.get_valid_moves().contains(new Location(3, 4)));
		
	}
}
