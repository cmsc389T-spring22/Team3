import java.awt.Color;
import junit.framework.*;
import java.io.*;

public class TestMapAttack extends TestCase {

	public void testMapAttack() throws FileNotFoundException {
		NoFrame nf = new NoFrame();
		Map map = nf.getMap();

		PacMan pacman = nf.addPacMan(new Location(1, 1));

		Ghost blinky = nf.addGhost(new Location(1, 2), "Blinky", Color.red);
		Ghost clyde = nf.addGhost(new Location(1, 3), "Clyde", Color.orange);

		assertFalse(map.attack("Blinky"));
		assertFalse(map.attack("Clyde"));
	}
}
