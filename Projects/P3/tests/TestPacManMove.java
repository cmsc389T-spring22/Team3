import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestPacManMove extends TestCase {

	public void testPacManMove() throws FileNotFoundException{
		NoFrame nf = new NoFrame();

		PacMan pc = nf.addPacMan(new Location(1, 1));

		assertTrue(pc.move());
		assertFalse(pc.myLoc.equals(new Location(1, 2)) || pc.myLoc.equals(new Location(2, 1)));
	}
}
