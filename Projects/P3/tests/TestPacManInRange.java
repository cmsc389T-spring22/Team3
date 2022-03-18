import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestPacManInRange extends TestCase {

	public void testPacManInRange() throws FileNotFoundException{
		NoFrame nf = new NoFrame();

		Ghost blinky = nf.addGhost(new Location(1, 2), "Blinky", Color.red);
		Ghost clyde = nf.addGhost(new Location(1, 3), "Clyde", Color.orange);

		PacMan pacman = nf.addPacMan(new Location(1, 1));
	
		assertFalse(blinky.is_pacman_in_range());
		assertTrue(clyde.is_pacman_in_range());
	}
}
