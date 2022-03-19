import junit.framework.*;
import org.junit.Assert;
import java.awt.Color;
import java.io.*;

public class TestGhostValidMoves extends TestCase {

	public void testGhostValidMoves() throws FileNotFoundException{
		//Creating A Map
		NoFrame frame2 = new NoFrame(); //Creates A New Map With Walls and Tokens w/o a Display

		Ghost ghost = frame2.addGhost(new Location(3, 3), "red", Color.red);

		//assertTrue(ghost.get_valid_moves().size() == 3);
		assertTrue(ghost.get_valid_moves().contains(new Location(2, 3)));
		assertTrue(ghost.get_valid_moves().contains(new Location(4, 3)));
		assertTrue(ghost.get_valid_moves().contains(new Location(3, 4)));
	}
}
