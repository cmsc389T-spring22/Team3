import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestGhostMove extends TestCase {

	public void testGhostMove() throws FileNotFoundException{
		NoFrame frame = new NoFrame();

		int x = 5;
		int y = 5;
		Ghost ghost = frame.addGhost(new Location(x, y), "ghost", Color.red);

		assertTrue(ghost.move());
	}
}
