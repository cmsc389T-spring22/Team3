import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestGhostInRange extends TestCase {

	public void testGhostInRange() throws FileNotFoundException{
		NoFrame nf = new NoFrame();

		int x = 5;
		int y = 5;

		Ghost ghost = nf.addGhost(new Location(x, y), "ghost", Color.red);
		PacMan pacman1 = nf.addPacMan(new Location(x+1, y));
		PacMan pacman2 = nf.addPacMan(new Location(x-2, y));
	
		assertFalse(pacman1.is_ghost_in_range());
		assertTrue(pacman2.is_ghost_in_range());
	}
}

